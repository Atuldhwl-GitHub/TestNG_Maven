package pomPackageKOTAK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterDataPage 
{
	private static final WebDriver WebDriver = null;

	//Variables 
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	@FindBy (xpath = "//input[@id='amt']" )
	private WebElement loanAmount ;

	@FindBy (xpath = "//input[@id='per']")
	private WebElement interestPersent ;

	@FindBy (xpath = "//input[@id='yr']")
	private WebElement yearsTenure ;

	@FindBy (xpath = "//p[@class='f48 emi_value']")
	private WebElement monthlyEmi ;

	@FindBy (xpath = "//p[@class='f24 total_interest']")
	private WebElement interestPayable ;

	@FindBy (xpath = "//p[@class='f24 total_payment']")
	private WebElement totalAmountPAyable ;

	//Constructor
	
	public EnterDataPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	//Methods
	
	public void enterLoanAmount(String amount)
	{
		loanAmount.clear();
		loanAmount.sendKeys(amount);
	}
	
	public void enterInterestPersent(String IntPersent)
	{
		interestPersent.clear();
		interestPersent.sendKeys(IntPersent);
	}
	
	public void enterYearsTenuer(String Tenuer)
	{
		yearsTenure.clear();
		yearsTenure.sendKeys(Tenuer);
	}
	
	public void getMonthlyEmi()
	{
		String text = monthlyEmi.getText();
		System.out.println(text);
	}
	
	public void getInterestAmount()
	{
		String interst = interestPayable.getText();
		System.out.println(interst);
	}
	
	public void getTotalPayableAmount()
	{
		String totalAmount = totalAmountPAyable.getText();
		System.out.println(totalAmount);
	}

}
