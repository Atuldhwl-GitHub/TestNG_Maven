package testCase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pomPackageKOTAK.CalculateEmiPage;
import pomPackageKOTAK.EnterDataPage;
import pomPackageKOTAK.KotakHomePage;

public class HomeLoanEmiCalculatorTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	//Step 1 : Open Browser and Enter URl
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.kotak.com/en/home.html");  
		
	//Step 2 : Click on Explore Product, Loan, Home Loan
		
		KotakHomePage kotakHomePage = new KotakHomePage (driverTest);
		kotakHomePage.mouseActOnExploreProduct();
		kotakHomePage.mouseActOnLoan();
		kotakHomePage.mouseActOnHomeLoan();
		
	//Step 3 : Click on CalculateEmi
	
		CalculateEmiPage calculateEmiPage = new CalculateEmiPage (driverTest);
		calculateEmiPage.clickOnCalculateEmi();
		
	//Step 4 : Enter Data and Get Text
		
		EnterDataPage enterDataPage = new EnterDataPage (driverTest);
		Thread.sleep(2000);
		enterDataPage.enterLoanAmount("5600000");
		enterDataPage.enterInterestPersent("9");
		enterDataPage.enterYearsTenuer("19");
		Thread.sleep(3000);
		enterDataPage.getMonthlyEmi();
		enterDataPage.getInterestAmount();
		enterDataPage.getTotalPayableAmount();
		
	}

}
