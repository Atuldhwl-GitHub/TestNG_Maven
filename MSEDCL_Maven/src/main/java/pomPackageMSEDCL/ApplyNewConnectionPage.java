package pomPackageMSEDCL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyNewConnectionPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driver;
	
	private Actions act;
	
	private WebDriverWait wait;
	
	@FindBy (xpath = "//span[text()='Consumption Calculator']")
	private WebElement consumptionCalculator ;
	
	@FindBy (xpath = "//span[text()='Energy Bill Calculator']")
	private WebElement energyBillCalculator ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[1]")
	private WebElement bulb25Watts ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[2]")
	private WebElement bulb40Watts ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[3]")
	private WebElement bulb60Watts ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[4]")
	private WebElement bulb100Watts ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[5]")
	private WebElement tubeLight20Watts ;
	
	@FindBy (xpath = "(//input[@class='inp_field'])[6]")
	private WebElement cFL20Watts ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl02$usageHours']")
	private WebElement hoursPerDayFor25WattsBulb ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl03$usageHours']")
	private WebElement hoursPerDayFor40WattsBulb ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl04$usageHours']")
	private WebElement hoursPerDayFor60WattsBulb ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl05$usageHours']")
	private WebElement hoursPerDayFor100WattsBulb ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl06$usageHours']")
	private WebElement hoursPerDayFor20WattsTubeLight ;
	
	@FindBy (xpath = "//select[@name='applianceGrid$ctl07$usageHours']")
	private WebElement hoursPerDayFor20WattsCFL ;
	
	@FindBy (xpath = "//span[text()='Next']")
	private WebElement next1Button ;
	
	@FindBy (xpath = "//select[@name='supplyType']")
	private WebElement supplyType ;
	
	@FindBy (xpath = "//select[@name='tariff']")
	private WebElement tariff ;
	
	@FindBy (xpath = "//input[@name='sanctionLoad']")
	private WebElement sanctionLoad ;
	
	
	
	public ApplyNewConnectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void clickOnConsumptionCalculator() {
		consumptionCalculator.click();
	}
	
	public void clickOnEnergyBillCalculator() {
		energyBillCalculator.click();
	}
	
	public void entreUnitInBulb100Watts(String NoOfBuld) {
		bulb100Watts.sendKeys(NoOfBuld);
	}
	
	public void entreUnitInTubeLight20Watts(String NoOfTubeLight) {
		tubeLight20Watts.sendKeys(NoOfTubeLight);
	}
	
	public void entreUnitInCFL20Watts(String NoOfCFL) {
		cFL20Watts.sendKeys(NoOfCFL);
	}
	
	public void clickOnnext1Button() {
		next1Button.click();
	}

}
