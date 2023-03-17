package pomPackageKOTAK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPaymentPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//h5[text()='Provide your Kotak Mahindra loan Account no or CRN details']")
	private WebElement textExpected ;
	
	
	
	public WebPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	public void getWrittenText()
	{
		wait.until(ExpectedConditions.visibilityOf(textExpected));
		String expectedtext = textExpected.getText();
		String actualtext = "Provide your Kotak Mahindra loan Account no or CRN details" ;
		
		if (expectedtext.equals(actualtext))
		{
			System.out.println("Text Pass");
		}
		else
		{
			System.out.println("Text Fail");
		}
		
	}
	
	//Get Url
	//Get Title
	

}
