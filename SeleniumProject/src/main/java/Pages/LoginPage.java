package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}    
	@FindBy(id="user-name")private WebElement UserName;
	@FindBy(id="password")private WebElement Password;
	@FindBy(id="login-button")private WebElement LoginButton;
	
	public void enterUserNameOnUserNameField() {
		UserName.sendKeys("standard_user");
    }
	public void enterPasswordOnPasswordField() {
		Password.sendKeys("secret_sauce");
    }
	public void clickOnLoginButton() {
		LoginButton.click();
	}
}
