package testCase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackageKOTAK.BillPaymentPage;
import pomPackageKOTAK.KotakHomePage;
import pomPackageKOTAK.WebPaymentPage;

public class LoanEmiPaymentTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1 : Open Browser and Enter URl
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
			WebDriver driverTest = new ChromeDriver();
			driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			
			driverTest.get("https://www.kotak.com/en/home.html");  
			
		//Step 2 : Click on MakePayment, Loanpayment, LaonEMiPAyment
			KotakHomePage kotakHomePage = new KotakHomePage (driverTest);
			kotakHomePage.mouseActOnMakepayment();
			kotakHomePage.mouseActOnLoanPayment();
			kotakHomePage.mouseActOnLoanEmiPayment();
			kotakHomePage.clickOnProceed();
			
		//Step 3 : Page change, get url, get tittle, verify 
			//Child Browser
			ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles());
			driverTest.switchTo().window(addr1.get(1));
			
			BillPaymentPage billPaymentPage = new BillPaymentPage(driverTest) ; //Page obeject
			
			String title = driverTest.getTitle();
			System.out.println(title);
			
			String url = driverTest.getCurrentUrl();
			System.out.println(url);
			
			String expectedTitle = "Online EMI Payment";
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
			
			//Step 4 : Get Text, Get Url, Get tittle 
			WebPaymentPage webPaymentPage = new WebPaymentPage(driverTest);
			webPaymentPage.getWrittenText();
			
			String actualTitle = driverTest.getTitle();
			System.out.println(title);
			
			String actualUrl = driverTest.getCurrentUrl();
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
}
