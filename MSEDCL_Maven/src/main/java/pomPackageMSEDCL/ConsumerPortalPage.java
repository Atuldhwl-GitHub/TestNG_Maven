package pomPackageMSEDCL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsumerPortalPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driver;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	@FindBy (xpath = "//i[@class='icon fa fa-plug']")
	private WebElement applyNewConnection ;
	
	@FindBy (xpath = "//i[@class='icon fa fa-th']")
	private WebElement renewableEnergyPortal ;
	
	@FindBy (xpath = "//i[@class='icon fa fa-file-text-o']")
	private WebElement viewPayBills ;
	
	public ConsumerPortalPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void clickOnApplyNewConnection() {
		applyNewConnection.click();
	}
	
	public void clickOnRenewableEnergyPortal() {
		renewableEnergyPortal.click();
	}
	
	public void clickOnViewPayBills() {
		viewPayBills.click();
	}

}
