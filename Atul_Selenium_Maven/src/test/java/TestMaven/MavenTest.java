package TestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MavenTest 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hi, How are you?");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait 3.141.59 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//Explicit Wait 3.141.59 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
	}
	

}
