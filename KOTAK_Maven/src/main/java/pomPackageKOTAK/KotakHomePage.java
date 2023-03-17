package pomPackageKOTAK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KotakHomePage 
{
	private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;

	//Variables 
	
	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]" )
			private WebElement exploreProduct ;
		
	@FindBy (xpath = "(//a[text()='Loans'])[4]" )
			private WebElement loans ;
		
	@FindBy (xpath = "(//a[text()='Home Loan'])[2]" )
			private WebElement homeLoan ;
	
	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[4]")
			private WebElement makepayment ;
	
	@FindBy (xpath = "(//a[text()='Loan / Card Payment'])[3]")
			private WebElement loanPayment ;
	
	@FindBy (xpath = "(//a[text()='Loan EMI Payment'])[3]")
			private WebElement loanEmiPayment ;
	
	@FindBy (xpath = "(//a[text()='Proceed'])[22]")
			private WebElement proceed ;
	
	@FindBy (xpath = "(//a[@href='/en/reach-us.html'])[1]")
			private WebElement locateUs ;
		
	
	//Constructor
		
	public KotakHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
		
	//Methods
		
	public void mouseActOnExploreProduct() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(exploreProduct));
		act.moveToElement(exploreProduct).build().perform();
	}	
		
	public void mouseActOnLoan() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(loans));
		act.moveToElement(loans).build().perform();
	}	
		
	public void mouseActOnHomeLoan() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(homeLoan));
		act.moveToElement(homeLoan).click().build().perform();
	}
	
	public void mouseActOnMakepayment() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(makepayment));
		act.moveToElement(makepayment).build().perform();
	}	
		
	public void mouseActOnLoanPayment() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(loanPayment));
		act.moveToElement(loanPayment).build().perform();
	}	
	
	public void mouseActOnLoanEmiPayment() // Mouse Action
	{
		wait.until(ExpectedConditions.visibilityOf(loanEmiPayment));
		act.moveToElement(loanEmiPayment).build().perform();
		loanEmiPayment.click();
	}
	
	public void clickOnProceed() 
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		proceed.click();
	}
	
	public void clickOnLocateUs()
	{
		wait.until(ExpectedConditions.visibilityOf(locateUs));
		locateUs.click();
	}
}
