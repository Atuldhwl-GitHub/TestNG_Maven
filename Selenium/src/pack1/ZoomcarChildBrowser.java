package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ZoomcarChildBrowser {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/");
		
		Thread.sleep(3000);
		
		//driver.manage().window().maximize();
		
		WebElement SelectCountry = driver.findElement(By.xpath("(//div[@class='multiselect__select'])[1]"));
		SelectCountry.click();
		
		Thread.sleep(2000);
		
		WebElement Country = driver.findElement(By.xpath("(//span[@class='dropdown-item__title'])[3]"));
		Country.click();
		
		Thread.sleep(1000);
		
		WebElement City1 = driver.findElement(By.xpath("(//span[@class='dropdown-item__title'])[7]"));
		City1.click();
		
		Thread.sleep(1000);
		
		WebElement Confrim = driver.findElement(By.xpath("//button[@class='city-lightbox__confirm-button']"));
		Confrim.click();
		
		Thread.sleep(4000);
		
		// Scroll Down code
		
		WebElement Invester = driver.findElement(By.xpath("//h2[text()='Our Investors']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",Invester);
		
		Thread.sleep(2000);
		
		// Child Browser& 2nd tab code
		
		WebElement P2S = driver.findElement(By.xpath("//a[text()='Pune to Shirdi']"));
		P2S.click();
		
		Thread.sleep(2000);
		
		ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		WebElement Confrim1 = driver.findElement(By.xpath("//button[@class='city-lightbox__confirm-button']"));
		Confrim1.click();
		
		Thread.sleep(1000);
		
		// 2nd child browser tab 
		
		WebElement ReadMore = driver.findElement(By.xpath("//div[@class='page-home-announcement']"));
		ReadMore.click();
		
		Thread.sleep(1000);
		
		ArrayList<String> addr2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr2.get(2));
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		WebElement Accept = driver.findElement(By.xpath("//button[text()='ACCEPT']"));
		Accept.click();
		
		
		
		
		
		
	}
}
