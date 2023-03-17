package pomPackageCRICBUZZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule {
	
	//Variables 
	
		@FindBy (xpath = "//a[text()='Schedule']" ) private WebElement schedule ;
		
		@FindBy (xpath = "(//a[text()='Teams'])[2]" ) private WebElement teams ;
		
		@FindBy (xpath = "(//a[text()='India'])[2]" ) private WebElement india ;
		
		@FindBy (xpath = "//a[text()='More Matches']" ) private WebElement morematches ;
		
		
		//Constructor
		
		public Schedule(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Methods
		
		public void clickonschedule() {
			schedule.click();
		}
		
		public void clickonteams() {
			teams.click();
		}
		
		public void clickonindia() {
			india.click();
		}
		
		public void clickonmorematches() {
			morematches.click();
		}

}
