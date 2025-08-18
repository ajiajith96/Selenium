package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	public void verifyMultipleWindow() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindowhandleId = driver.getWindowHandle();
		System.out.println(firstwindowhandleId);
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		
		String secondWindowHandleId = driver.getWindowHandle();
		System.out.println(secondWindowHandleId);
		
		Set <String> handleIds = driver.getWindowHandles();
		System.out.println(handleIds);
		
		Iterator <String> it = handleIds.iterator();
		while(it.hasNext()) {
			String currentId = it.next();
			if(!currentId.equals(firstwindowhandleId)) {
				driver.switchTo().window(currentId);
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("cajithgo@cmc.com");
				WebElement submit = driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
				submit.click();
				
				
			}
		}
	}

	public static void main(String[] args) {

		HandlingMultipleWindow window = new HandlingMultipleWindow();
		window.initializeBrowser();
		window.verifyMultipleWindow();
	}

}
