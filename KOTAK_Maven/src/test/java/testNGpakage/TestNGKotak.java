package testNGpakage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackageKOTAK.BillPaymentPage;
import pomPackageKOTAK.CalculateEmiPage;
import pomPackageKOTAK.EnterDataPage;
import pomPackageKOTAK.FindLocationPage;
import pomPackageKOTAK.KotakHomePage;
import pomPackageKOTAK.WebPaymentPage;

public class TestNGKotak {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
		driver.get("https://www.kotak.com/en/home.html"); 
		
	}
	
	@Test
	public void test1VerifyHomeLoanEmiCalculator() throws InterruptedException {
		System.out.println("Test1");
		KotakHomePage kotakHomePage = new KotakHomePage (driver);
		kotakHomePage.mouseActOnExploreProduct();
		kotakHomePage.mouseActOnLoan();
		kotakHomePage.mouseActOnHomeLoan();
		
		CalculateEmiPage calculateEmiPage = new CalculateEmiPage (driver);
		calculateEmiPage.clickOnCalculateEmi();
		
		EnterDataPage enterDataPage = new EnterDataPage (driver);
		Thread.sleep(2000);
		enterDataPage.enterLoanAmount("5600000");
		enterDataPage.enterInterestPersent("9");
		enterDataPage.enterYearsTenuer("19");
		Thread.sleep(3000);
		enterDataPage.getMonthlyEmi();
		enterDataPage.getInterestAmount();
		enterDataPage.getTotalPayableAmount();
	}
	
	@Test
	public void test2VerifyEmiWebPayment() {
		System.out.println("Test2");
		
		KotakHomePage kotakHomePage = new KotakHomePage (driver);
		kotakHomePage.mouseActOnMakepayment();
		kotakHomePage.mouseActOnLoanPayment();
		kotakHomePage.mouseActOnLoanEmiPayment();
		kotakHomePage.clickOnProceed();
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		BillPaymentPage billPaymentPage = new BillPaymentPage(driver) ; //Page obeject
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String expectedTitle = "Kotak Bank : Online EMI Payment";
		String expectedUrl = "https://payments.billdesk.com/MercOnline/kotakemi/kotakEMITermsAndConditions.jsp?type=bank";
				
		if (title.equals(expectedTitle) && url.equals(expectedUrl))
		{
			System.out.println("Test Pass Bill Page");
		}
		else
		{
			System.out.println("Test Fail Bill Page");
		}
		

		billPaymentPage.clickOnWebPayNow();
		
		
		WebPaymentPage webPaymentPage = new WebPaymentPage(driver);
		webPaymentPage.getWrittenText();
		
		String actualTitle = driver.getTitle();
		System.out.println(title);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(url);
		
		String expectedtitle = "PolicyBazaar Car Insurance: Insure Your Car Today";
		String expectedurl = "https://ci.policybazaar.com/questions?ishome=true";
				
		if (actualTitle.equals(expectedtitle) && actualUrl.equals(expectedurl))
		{
			System.out.println("Test Pass Web Pay");
		}
		else
		{
			System.out.println("Test Fail Web Pay");
		}
		
	}
	
	@Test
	public void test3VerifyLocateUsFunction() {
		System.out.println("Test3");
		
		KotakHomePage kotakHomePage = new KotakHomePage (driver);
		kotakHomePage.clickOnLocateUs();
		
		FindLocationPage findLocationPage = new FindLocationPage (driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		findLocationPage.findState();
		findLocationPage.clickOnMaharshtra();
		findLocationPage.findCity();
		findLocationPage.clickOnPune();
		findLocationPage.getTextForVerification();
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	
		//driver.close();
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		
		driver.quit();
	}

}
