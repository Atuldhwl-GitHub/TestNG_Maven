package pomPackageMSEDCL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Maha_HomePage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driver;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	@FindBy (xpath = "(//button[@class='pum-close popmake-close'])[1]")
	private WebElement closeButton ;
	
	@FindBy (xpath = "(//img[@class='alignnone size-full wp-image-29572 aligncenter'])[1]")
	private WebElement consumerPortal ;
	
	
	public Maha_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void clickOnCloseButton() {
		closeButton.click();
	}
	
	public void clickOnConsumerPortal() {
		consumerPortal.click();
	}

}
