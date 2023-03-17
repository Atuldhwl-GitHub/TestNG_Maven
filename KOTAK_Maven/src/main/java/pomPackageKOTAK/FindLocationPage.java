package pomPackageKOTAK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindLocationPage {
	
private static final WebDriver WebDriver = null;
	
	private WebDriver driverG;
	
	private Actions act;
	
	private WebDriverWait wait;
	
//	@FindBy (xpath = "//select[@name='statedropdown']")
//	private WebElement selectState ;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement selectState ;
	
	@FindBy (xpath = "//span[text()='MAHARASHTRA']")
	private WebElement selectMaharashtra ;
	
//	@FindBy (xpath = "//select[@name='citydropdown']")
//	private WebElement selectCity ;
	
	@FindBy (xpath = "(//button[@type='button'])[4]")
	private WebElement selectCity ;
	
	@FindBy (xpath = "//span[text()='PUNE']")
	private WebElement selectPune ;
	
	@FindBy (xpath = "(//div[@class='location'])[1]//div//div")
	private WebElement verifyText ;
	
	
	public FindLocationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG = driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driverG, 10);
	}
	
	
	public void findState()
	{
	//	JavascriptExecutor js = (JavascriptExecutor)driverG;
//		js.executeScript("arguments[0].scrollIntoView(true);",selectState);
	//	js.executeScript("window.scrollBy(0,300)");
		
		wait.until(ExpectedConditions.visibilityOf(selectState));
//		act.moveToElement(selectState).click().build().perform();
		
		selectState.click();
//		Select s = new Select(selectState);
//		s.selectByValue("MAHARASHTRA");
	}
	
	public void clickOnMaharshtra()
	{
		wait.until(ExpectedConditions.visibilityOf(selectMaharashtra));
		selectMaharashtra.click();
	}

	
	public void findCity()
	{
		wait.until(ExpectedConditions.visibilityOf(selectCity));
		selectCity.click();
//		Select s = new Select(selectCity);
//		s.selectByVisibleText("PUNE");
	}
	
	public void clickOnPune()
	{
		wait.until(ExpectedConditions.visibilityOf(selectPune));
		selectPune.click();
	}
	
	public void getTextForVerification()
	{
		wait.until(ExpectedConditions.visibilityOf(verifyText));
		String actualText = verifyText.getText();
		String expectedText = "ATM-Pune-Wagholi";
		
		if (expectedText.equals(actualText))
		{
			System.out.println("Locate Us Test Case Passed");
		}
		else
		{
			System.out.println("Locate Us Test Case Failed");
		}
	}

}
