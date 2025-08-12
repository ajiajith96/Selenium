package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	/*public void handlingdropdown() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		
		//select.selectByValue("java");
		
		//select.selectByVisibleText("JAVA");
	
	}*/
	
	public void handlingCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox2.click();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox2.isSelected());
	}
	
	/*public void handlingRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='yellow']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
	}*/
	
	

	public static void main(String[] args) {
		
		HandlingDropDown drop = new HandlingDropDown();
		drop.initializeBrowser();
		//drop.handlingdropdown();
		drop.handlingCheckBox();
		//drop.handlingRadioButton();
		
	}

}
