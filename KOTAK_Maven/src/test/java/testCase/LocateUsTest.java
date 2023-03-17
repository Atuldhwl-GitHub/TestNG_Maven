package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackageKOTAK.FindLocationPage;
import pomPackageKOTAK.KotakHomePage;

public class LocateUsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1 : Open Browser and Enter URl
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
			WebDriver driverTest = new ChromeDriver();
			driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			
			driverTest.get("https://www.kotak.com/en/home.html");  
			
		//Step 2 : Click on Explore Product, Loan, Home Loan
			
			KotakHomePage kotakHomePage = new KotakHomePage (driverTest);
			kotakHomePage.clickOnLocateUs();
			
			FindLocationPage findLocationPage = new FindLocationPage (driverTest);
			findLocationPage.findState();
			findLocationPage.clickOnMaharshtra();
			findLocationPage.findCity();
			findLocationPage.clickOnPune();
			findLocationPage.getTextForVerification();
			
			
	}
}
