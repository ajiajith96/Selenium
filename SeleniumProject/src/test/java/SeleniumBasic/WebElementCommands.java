package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void handlingElements() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//sendKeys
		WebElement msgbox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgbox.sendKeys("Obsqura Training");
		
		//click
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		
		//get text
		WebElement message = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(message.getText());
		
		//clear
		msgbox.clear();
		
		//get CSS Value
		System.out.println(button.getCssValue("background-color")); // value of the button show message is rgba(0, 105, 217, 1).
	}

	public static void main(String[] args) {
		
		WebElementCommands webElmnt = new WebElementCommands();
		webElmnt.initializeBrowser();
		webElmnt.handlingElements();
	}

}
