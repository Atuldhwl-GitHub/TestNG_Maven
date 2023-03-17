package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");  // Get Method
		
		Thread.sleep(2000); 
		
		driver.manage().window().maximize();  // Maximize Method
		
		Thread.sleep(2000); 

		driver.navigate().forward(); // forward navigate
		
		Thread.sleep(2000); 
		
		driver.navigate().refresh(); // referesh operation

		
		WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("atuldhwl@gmail.com"); // Sendkeys 
		
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//button[@value='1']"));
		Login.click(); // Click 
		
		Thread.sleep(2000);
		
	
		
		
		
	}	
}
