package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		//Fletching Data from Excel Sheet
		
		String path = "C:\\Users\\shipali.rana\\Desktop\\Atul-TDG\\Selenium Screenshot\\SeleniumExcel.xlsx";
		
		InputStream file = new FileInputStream(path);
		
	//	String data = WorkbookFactory.create(file).getSheet("Practice").getRow(3).getCell(0).getStringCellValue();
		
	//	double data = WorkbookFactory.create(file).getSheet("Practice").getRow(4).getCell(1).getNumericCellValue();
		
		Date data = WorkbookFactory.create(file).getSheet("Practice").getRow(6).getCell(0).getDateCellValue();
		
		System.out.println(data);
		
		
		
		
		
		
		
		
	}

}
