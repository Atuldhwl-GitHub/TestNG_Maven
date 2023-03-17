package pomPackagePOLICY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyBazzarMainPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "(//i[@class='icon-bg homeIconsBg car-insurance'])[2]")
	private WebElement carInsurance ;
	
	@FindBy (xpath = "(//a[@href='#'])[1]")
	private WebElement withoutCarNumber ;
	
	@FindBy (xpath = "//span[@id='spn6']")
	private WebElement rtoPune ;
	
	@FindBy (xpath = "//span[text()='MH12']")
	private WebElement mh12 ;
	
	@FindBy (xpath = "//span[@class='renault']")
	private WebElement renault ;
	
	@FindBy (xpath = "//b[text()='DUSTER']")
	private WebElement duster ;
	
	@FindBy (xpath = "//b[text()='Diesel']")
	private WebElement diesel ;
	
	@FindBy (xpath = "//b[text()='2ND ANNIVERSARY EDITION (1461 cc)']")
	private WebElement carVariant ;
	
	@FindBy (xpath = "//b[text()='2018']")
	private WebElement year2018 ;
	
	
	
	public PolicyBazzarMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	
	public void cliclOnCarInsurance () {
		wait.until(ExpectedConditions.visibilityOf(carInsurance));
		carInsurance.click();
	}
	
	public void cliclOnWithoutCarNumber () {
		wait.until(ExpectedConditions.visibilityOf(withoutCarNumber));
		withoutCarNumber.click();
	}
	
	public void cliclOnRtoPune () {
		wait.until(ExpectedConditions.visibilityOf(rtoPune));
		rtoPune.click();
	}
	
	public void cliclOnMh12 () {
		wait.until(ExpectedConditions.visibilityOf(mh12));
		mh12.click();
	}
	
	public void cliclOnRenault () {
		wait.until(ExpectedConditions.visibilityOf(renault));
		renault.click();
	}
	
	public void cliclOnDuster () {
		wait.until(ExpectedConditions.visibilityOf(duster));
		duster.click();
	}
		
	public void cliclOnDiesel () {
		wait.until(ExpectedConditions.visibilityOf(diesel));
		diesel.click();	
	}
	
	public void cliclOnCarVariant () {
		wait.until(ExpectedConditions.visibilityOf(carVariant));
		carVariant.click();	
	}
	
	public void cliclOnYear2018 () {
		wait.until(ExpectedConditions.visibilityOf(year2018));
		year2018.click();	
	}
}
