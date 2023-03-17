package pack1;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testing {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
								// 3.141.59
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
								// 4.0.0
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMills(20000));
		
		
		
		driver.get("https://www.amazon.in/");
		
		//Explecit Wait
												// 3.141.59
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10);
		
												// 4.0.0
//		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
//		
//
//		
//		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
//		user.sendKeys("Atul");
		
		WebElement Search = driver.findElement(By.xpath("))
		
		WebElement Mobile = driver.findElement(By.xpath("(((//div[@class='sg-row']//div)[7]//div)[11]//span)[2]"));
		Mobile.getText();
	}
	
	
	

}
