package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("atuldhwl@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Friends@08");
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement LoginwithFB = driver.findElement(By.xpath("//span[@class='_ab37']"));
		LoginwithFB.click(); 
		
		Thread.sleep(2000);
		
		WebElement FBLogin = driver.findElement(By.xpath("//input[@type='text']"));
		FBLogin.sendKeys("atuldhwl@gmail.com");
		
		WebElement FBPassword = driver.findElement(By.xpath("//input[@type='password']"));
		FBPassword.sendKeys("Friends@08");
		
		Thread.sleep(3000);
		
		WebElement FBlogin = driver.findElement(By.xpath("(//button)"));
		FBlogin.click();
		
		
		
		
		
		
	}	

}
