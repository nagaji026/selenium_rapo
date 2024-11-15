package genericutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	/*
	 * @author : Naveen K Pathak
	 */
public class WebDriverUtility {
	
	// we can make them global variable also then no need to define in mathod
	
//	public WebDriver driver;
//	public Actions action;
//	public WebDriverUtility(WebDriver driver) {
//		this.driver =  driver;
//		action = new Actions(driver);
//	}
	
	/*
	 * 	This method is used to maximize window
	 * 	@param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/*
	 * 	This method is used to capture size of a window
	 * 	@param driver
	 * 	@return Dimension
	 */
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();
	}
	
	/*
	 * 	This method is used to switch driver control to window based on url
	 * 	@param driver
	 * 	@param url
	 */
	public void switchToWindow(WebDriver driver, String url) {
		// step:1 capture window ids
		Set<String> allWindowId = driver.getWindowHandles();
		
		// step:2 navigate through all windows
		for (String id:allWindowId) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}
	
	/*
	 * 	This method is used to perform right click on webpage
	 * 	@param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.contextClick().perform();
	}
	
	public void clickAndHold(WebDriver driver) {
		Actions action = new Actions(driver);
		action.clickAndHold().perform();;
	}
	
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void mouseHover(WebDriver driver, int x, int y) {
		Actions action = new Actions(driver);
		action.moveByOffset(x, y).perform();
	}
	
	public void doubleClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.doubleClick().perform();
	}
	
	public void doubleClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);		
	}
	
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);		
	}
	
	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);		
	}
	
	public void switchToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void handleDropdown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void handleDropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void handleDropdownByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndSendKeys(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	
	public void switchToAlertAndGetText(WebDriver driver, String data) {
		driver.switchTo().alert().getText();
	}
	
	public void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void jsScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void jsScrollTillBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	

}
