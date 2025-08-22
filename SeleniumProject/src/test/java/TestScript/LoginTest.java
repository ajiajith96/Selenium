package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import AutomationCore.TestngBase;
import Pages.LoginPage;

public class LoginTest extends TestngBase{
	
	@Test
	public void verifyUserLoginWithValidCredential() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterPasswordOnPasswordField();
		loginpage.enterUserNameOnUserNameField();
		loginpage.clickOnLoginButton();
		//WebElement UserName = driver.findElement(By.id("user-name"));
		//UserName.sendKeys("standard_user");
		//WebElement Password = driver.findElement(By.id("password"));
		//Password.sendKeys("secret_sauce");
		//WebElement LoginButton = driver.findElement(By.id("login-button"));
		//LoginButton.click();
	}
    
	@Test
	public void verifyUserLoginWithWrongCredential() {
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standarduser");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secretsauce");
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
	}
	@Test
	public void verifyValidUsernameAndInvalidPassword() {
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("sauce");
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
	}
	@Test
	public void verifyInvalidUsernameAndValidPassword() {
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
	}
}
