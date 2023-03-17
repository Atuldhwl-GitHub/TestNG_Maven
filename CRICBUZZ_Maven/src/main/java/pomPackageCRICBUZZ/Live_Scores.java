package pomPackageCRICBUZZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Live_Scores {
	
	//Variables 
	
	@FindBy (xpath = "//a[text()='Live Scores']" ) private WebElement livescore ;
	
	@FindBy (xpath = "//a[text()='Current & Future Series']" ) private WebElement currentfutureseries ;
	
	@FindBy (xpath = "//a[text()='T20 Leagues']" ) private WebElement t20leagues ;
	
	@FindBy (xpath = "//span[text()='T20 Blast 2023']" ) private WebElement t20blast2023 ;
	
	
	//Constructor
	
	public Live_Scores(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	
	public void clickonlivesocre() {
		livescore.click();
	}
	
	public void clickoncurrentfutureseries() {
		currentfutureseries.click();
	}
	
	public void clickont20leagues() {
		t20leagues.click();
	}
	
	public void clickont20blas2023() {
		t20blast2023.click();
	}
}
