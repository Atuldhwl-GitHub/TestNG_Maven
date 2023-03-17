package pomPackageKOTAK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPaymentPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//button[@name='Submit']")
	private WebElement webPayNow ;
	
	
	
	public BillPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	public void clickOnWebPayNow() {
		wait.until(ExpectedConditions.visibilityOf(webPayNow));
		webPayNow.click();
	}
	
	//Get Url
	//Get Title

}

