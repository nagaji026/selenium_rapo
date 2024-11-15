package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailtextField;
	
	@FindBy(id = "Password")
	private WebElement passwordtextField;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtextField() {
		return emailtextField;
	}	

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}	

	public WebElement getLoginButton() {
		return loginButton;
	}

}
