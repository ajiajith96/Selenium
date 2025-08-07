package SeleniumBasic;

import org.openqa.selenium.By;

public class Locators extends Base {
	
		public void handlinglocators() {
			driver.findElement(By.id("button-one"));
			driver.findElement(By.className("btn btn-primary"));
			driver.findElement(By.tagName("input"));
			driver.findElement(By.linkText("Simple Form Demo"));
			driver.findElement(By.cssSelector("button[id='button-one']"));
		//	/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button - absolute xpath
			//tagname[@attribute='attributevalue']-relative xpath.
			driver.findElement(By.xpath("input[@id='single-input-field']"));
			driver.findElement(By.xpath("//button[text()='Show Message']"));
			driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]")); //if text message is lengthier we can use only starting word.
			driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); // to check with 2 attributes for getting 1/1.
			driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']")); // either one of the attribute.
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

