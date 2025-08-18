package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verifySimpleAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
	    Alert alert = driver.switchTo().alert();
	    //alert.accept();
	    alert.dismiss();
		
	   
	}

	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
        WebElement promptalert = driver.findElement(By.id("promtButton"));
        promptalert.click();
        Alert alert = driver.switchTo().alert();
	    alert.sendKeys("PromptMessage");
	    alert.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HandlingAlerts Alerts = new HandlingAlerts();
        Alerts.initializeBrowser();
        //Alerts.verifySimpleAlert();
        //Alerts.verifyConfirmAlert();
        Alerts.verifyPromptAlert();
        
	}

}
