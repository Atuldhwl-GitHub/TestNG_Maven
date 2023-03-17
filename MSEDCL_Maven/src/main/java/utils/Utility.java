package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	private WebDriver driver;
	
	public void captureScreenShot (WebDriver driver) throws IOException {
		
		
	
	// How to Take ScreenShot in Selenium ============================================================================
	
			TakesScreenshot t = (TakesScreenshot)driver;
			
			
																// Basic ScreenShot Taking
//			File src = t.getScreenshotAs(OutputType.FILE);
//			
//			File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens123.jpeg");
//			
//			FileHandler.copy(src, dest);
			
			
																// Multiple ScreenShot Taking
//			for (int i = 0; i < 5; i++)
//			{
//				File src = t.getScreenshotAs(OutputType.FILE);
//				
//				File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens" +i+ ".jpeg");
//				
//				FileHandler.copy(src, dest);
//			}
			
															// Random Number ScreenShot Taking
//			Random r = new Random();
//			
//			File src = t.getScreenshotAs(OutputType.FILE);
//			
//			for (int i = 0; i<3; i++)
//			{
//				int v = r.nextInt(8);
//				
//				File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens" + v + ".jpeg");
//				
//				FileHandler.copy(src, dest);
//			}
			
														// Date & Time Changing ScreenShot Taking
			
			Date d = new Date();
			System.out.println(d);
			
			File src = t.getScreenshotAs(OutputType.FILE);
			
			String filename= d.toString().replace(" ", "_").replace(":", "_");
			System.out.println(filename);
			
			File dest = new File("C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\Siemens"+filename+".jpg");
			
			FileHandler.copy(src, dest);
			
	}		
			
//===========================================================================

	public void fetchDatafromExcelSheet (WebDriver driver) throws IOException  {
			//Fletching Data from Excel Sheet
			
			String path = "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\SeleniumExcel.xlsx";
			
			InputStream file = new FileInputStream(path);
			
		//	String data = WorkbookFactory.create(file).getSheet("Practice").getRow(3).getCell(0).getStringCellValue();
			
		//	double data = WorkbookFactory.create(file).getSheet("Practice").getRow(4).getCell(1).getNumericCellValue();
			
			Date data = WorkbookFactory.create(file).getSheet("Practice").getRow(6).getCell(0).getDateCellValue();
			
			System.out.println(data);
			
			
		}	


}
