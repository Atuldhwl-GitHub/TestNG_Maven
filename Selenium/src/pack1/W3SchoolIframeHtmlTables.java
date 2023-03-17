package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolIframeHtmlTables {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Tools Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.get("https://www.w3schools.com/html/html_tables.asp"); // HTML Table
		
		Thread.sleep(5000);
		
	//	WebElement TryItYourself = driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[1]"));
	//	TryItYourself.click();
		
	//	Thread.sleep(4000);
		
	//	ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
	//	driver.switchTo().window(addr1.get(1));
		
	//	Thread.sleep(2000);
		
		// Iframe Example 
		
	/*	WebElement TargetEle = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); //Frame 1
		
		driver.switchTo().frame(TargetEle);
		
		Thread.sleep(2000);
		
		WebElement Traget2 = driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']")); //Frame 2
		
		driver.switchTo().frame(Traget2);
		
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//a[@class='w3-bar-item w3-btn w3-right']")); 
		Login.click();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
	//	driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		WebElement GetWeb = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		GetWeb.click();
		
		System.out.println(driver.getCurrentUrl());*/
		
		// HTML Tables -
		
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		int noofcells = cells.size();
		System.out.println(noofcells);
		
		System.out.println("=====================");
		
		for(int i = 0; i < noofcells; i++)
		{
	//		WebElement c = cells.get(i);
	//		System.out.println(c.getText());
			
			System.out.println(cells.get(i).getText());
		}

	//	System.out.println("====================="); 
		
		// to print in same line
		
//		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		
//		System.out.println(row.size()); 
//		
//		for(int i = 0; i <= row.size(); i++)
//		{
//			List<WebElement> colum = driver.findElements(By.xpath("//table[@id='customers']//tr[" + i + "]//td"));
//			
//			for(int j = 0 ; j < colum.size() ; j++)
//			{
//				WebElement d = colum.get(j);
//				System.out.print(d.getText()+ ", ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
	//	System.out.println("=====================");
		
		// Pass Fail
		
		
		List<WebElement> cells1 = driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		int noofcells1 = cells.size();
		System.out.println(noofcells);
		
		System.out.println("=====================");
		
		for(int i = 0; i < noofcells1; i++)
		{
	//		WebElement c = cells.get(i);
	//		System.out.println(c.getText());
			
			System.out.println(cells1.get(i).getText());
		}
		
		String result []= {"Alfreds Futterkiste", "Maria Anders", "Germany", "Centro comercial Moctezuma",
				"Francisco Chang", "Mexico", "Ernst Handel", "Roland Mendel", "Austria", "Island Trading",
				"Helen Bennett", "UK", "Laughing Bacchus Winecellars", "Yoshi Tannamuri", "Canada",
				"Magazzini Alimentari Riuniti", "Giovanni Rovelli", "Italy"};
					
		System.out.println(result.length);
		
		
		
		for(int x=0; x<= result.length-1; x++)
		{
			WebElement y = cells1.get(x);
			if(y.getText().equals(result[x]))
			{
				System.out.println(x);
				System.out.println("Pass");
				System.out.println(y.getText());
			}
			else
			{
				System.out.println(x);
				System.out.println("Fail");
			}
			System.out.println( );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
