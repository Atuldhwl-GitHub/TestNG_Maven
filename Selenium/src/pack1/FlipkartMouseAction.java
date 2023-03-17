package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseAction {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	/*	WebElement Mobile = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Mobile.sendKeys("9595272383");
		
		WebElement Password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		Password.sendKeys("Friends@09");
		
		Thread.sleep(3000);
		
		WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Login.click();*/
		
	//	Thread.sleep(3000);
		
	/*	WebElement Search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		Search.sendKeys("Mobiles");
		
		Thread.sleep(1000);
		
		WebElement SearchKey = driver.findElement(By.xpath("//button"));
		SearchKey.click(); */
		
	//	Thread.sleep(3000);
		
	/*	WebElement Price1 = driver.findElement(By.xpath("(//div[text()='₹11,999'])[1]")); //Price Element
		Price1.click();
		
		WebElement Samsung = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		Samsung.click();
		
		WebElement Mobiles = driver.findElement(By.xpath("(//div[@class='InyRMC _3Il5oO']//div//img)[1]"));
		Mobiles.click(); */
		
	//	Thread.sleep(3000);
		
	/*	WebElement Realme = driver.findElement(By.xpath("(//img[@class='_1aPR5_'])[1]"));
		Realme.click();
		
		Thread.sleep(3000);
		
		WebElement ModelC33 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		ModelC33.click();
		
		Thread.sleep(3000);
		
		WebElement Addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		Addtocart.click();
		
		WebElement Login1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Login1.click(); */
		
		Thread.sleep(3000);
		
		// Mouse Action
		
		WebElement Home = driver.findElement(By.xpath("(//img[@class='_396cs4'])[5]"));
		WebElement Decore = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		WebElement Clock = driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][5]"));
		
	/*	Actions act = new Actions(driver);
		
		act.moveToElement(Home).perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(Decore).perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(Clock).click().perform(); 
		
		Thread.sleep(3000);*/
		
		Home.click();
		Thread.sleep(5000);
		
		Decore.click();
		Thread.sleep(2000);
		
		Clock.click();
		
	}


}
