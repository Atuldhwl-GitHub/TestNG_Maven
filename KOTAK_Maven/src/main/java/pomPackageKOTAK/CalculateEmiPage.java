package pomPackageKOTAK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculateEmiPage 
{
	private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;

	//Variables 
	
	@FindBy (xpath = "(//a[text()='EMI Calculator'])[1]" ) 
	private WebElement calculateEmi ;
	
	//Constructor
	public CalculateEmiPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	//Methods
	public void clickOnCalculateEmi() //Scroll Down
	{
		wait.until(ExpectedConditions.visibilityOf(calculateEmi));
//		JavascriptExecutor js = (JavascriptExecutor)driverG;
//		js.executeAsyncScript("arguments[0].scrollIntoView(true);", calculateEmi);
		calculateEmi.click();
	}	

}
