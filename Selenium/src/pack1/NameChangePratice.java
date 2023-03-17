package pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NameChangePratice {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Test KWD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();								
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
		CreateNewAcc.click();
		
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Ambani");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		
		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);
		
		WebElement NewPassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		NewPassword.click();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}	
}
