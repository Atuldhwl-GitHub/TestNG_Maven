package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
	
		Thread.sleep(2000);

	/*	WebElement Movie = driver.findElement(By.xpath("//a[text()='Movies']"));
		Movie.click();
		
		WebElement Hindi = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 enhvog'])[1]"));
		Hindi.click(); */
		
		

	}	
}
