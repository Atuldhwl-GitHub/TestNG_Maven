package pack1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SiemensScreenshot {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.siemens.com/global/en.html");
		
		Thread.sleep(2000);
		
		// How to Take ScreenShot in Selenium ============================================================================
		
		TakesScreenshot t = (TakesScreenshot)driver;
		
		
															// Basic ScreenShot Taking
//		File src = t.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens123.jpeg");
//		
//		FileHandler.copy(src, dest);
		
		
															// Multiple ScreenShot Taking
//		for (int i = 0; i < 5; i++)
//		{
//			File src = t.getScreenshotAs(OutputType.FILE);
//			
//			File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens" +i+ ".jpeg");
//			
//			FileHandler.copy(src, dest);
//		}
		
														// Random Number ScreenShot Taking
//		Random r = new Random();
//		
//		File src = t.getScreenshotAs(OutputType.FILE);
//		
//		for (int i = 0; i<3; i++)
//		{
//			int v = r.nextInt(8);
//			
//			File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens" + v + ".jpeg");
//			
//			FileHandler.copy(src, dest);
//		}
		
													// Date & Time Changing ScreenShot Taking
		
		Date d = new Date();
		System.out.println(d);
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		String filename= d.toString().replace(" ", "_").replace(":", "_");
		System.out.println(filename);
		
		File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens"+filename+".jpg");
		
		FileHandler.copy(src, dest);
		
		
		
		
	}	

}
