package testClassPolicyBazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackagePOLICY.PolicyBazzarMainPage;

public class TestClassPolicyBazar {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1 : Open Browser and Enter URl
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
			WebDriver driverTest = new ChromeDriver();
			driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			
			driverTest.get("https://www.policybazaar.com/");  
			
			PolicyBazzarMainPage policyBazzarMainPage = new PolicyBazzarMainPage (driverTest) ;
			
			policyBazzarMainPage.cliclOnCarInsurance();
			policyBazzarMainPage.cliclOnWithoutCarNumber();
			policyBazzarMainPage.cliclOnRtoPune();
			policyBazzarMainPage.cliclOnMh12();
			policyBazzarMainPage.cliclOnRenault();
			policyBazzarMainPage.cliclOnDuster();
			policyBazzarMainPage.cliclOnDiesel();
			policyBazzarMainPage.cliclOnCarVariant();
			policyBazzarMainPage.cliclOnYear2018();
			
			String actualtitle = driverTest.getTitle();
			System.out.println(actualtitle);
			
			String actualUrl = driverTest.getCurrentUrl();
			System.out.println(actualUrl);
			
			String expectedTitle = "PolicyBazaar Car Insurance: Insure Your Car Today";
			String expectedUrl = "https://ci.policybazaar.com/questions?ishome=true";
					
			if (actualtitle.equals(expectedTitle) && actualUrl.equals(expectedUrl))
			{
				System.out.println("Test Pass");
			}
			else
			{
				System.out.println("Test Fail");
			}
			
			
			
	}
}
