package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RTOSelectMethod {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Online = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Online.click();
		
		Thread.sleep(1000);
		
		WebElement Veh = driver.findElement(By.xpath("//a[@href='/parivahan//en/content/vehicle-related-services']"));
		Veh.click();
		
		Thread.sleep(1000);

		WebElement State = driver.findElement(By.xpath("//select[@name='aa']"));
		State.click();
		
		Select s = new Select(State);
	//	s.selectByIndex(5);
		
		s.selectByValue("MH");
		
	//	s.selectByVisibleText("Maharashtra");
		
		Thread.sleep(1000);

	//	WebElement MH = driver.findElement(By.xpath("//option[@value='MH']"));
	//	MH.click();
	  
	    WebElement RTO = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]"));
		RTO.click();
		
	//	driver.navigate().back();
		
		Thread.sleep(3000); 
		
		WebElement NGP = driver.findElement(By.xpath("//li[@data-label='NAGPUR (U) (MH31)']"));
		NGP.click();

	//	driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Submit.submit();

	/*	WebElement Login = driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
		Login.click();
		
		Thread.sleep(2000);
		
		WebElement Sarthi = driver.findElement(By.xpath("(//a[@href='https://sarathi.parivahan.gov.in/sarathiservice'])[2]"));
		Sarthi.click(); */
		
		
		
	}
}
