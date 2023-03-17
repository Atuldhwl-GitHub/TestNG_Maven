package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//div[@class='signIn']"));
		Login.click();
		
		Thread.sleep(2000);
		
		WebElement Mobile = driver.findElement(By.xpath("//input[@maxlength='100']"));
		Mobile.sendKeys("9595272383");
		
		WebElement Continue = driver.findElement(By.xpath("//button[@class='submit-button']"));
		Continue.click();
		
		Thread.sleep(5000);
		
		WebElement continue1 = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		continue1.click();
		
		

	}	
}
