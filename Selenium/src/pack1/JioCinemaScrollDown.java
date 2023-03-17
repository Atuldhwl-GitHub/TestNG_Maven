package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCinemaScrollDown {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		
	//	WebElement Eng_Movies = driver.findElement(By.xpath("(//a[text()='English Movies'])[1]"));
		
		WebElement FAQ = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		
	//	WebElement Twitter = driver.findElement(By.xpath("(//button[@style='margin-right: 10px;'])[6]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // scroll down code
		
	//	js.executeScript("window.scrollBy(0,15000)");
		
		js.executeScript("arguments[0].scrollIntoView(true);",FAQ);
		
	//	Twitter.click();
		
		Thread.sleep(2000);
		
	//	Eng_Movies.click();
	 	FAQ.click();
	 	
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		Thread.sleep(2000);
		
		WebElement WJC = driver.findElement(By.xpath("(//div[@class='expandBtn'])[1]"));
		WJC.click();
		
		
		

	}	
}
