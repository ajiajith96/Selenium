package SeleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingSendkeys() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\HP\\git\\Selenium\\SeleniumProject\\src\\test\\resources\\Amaze-Accessory-Brochure.pdf");
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement file = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		file.click();
		
		
		StringSelection s = new StringSelection("C:\\Users\\HP\\git\\Selenium\\SeleniumProject\\src\\test\\resources\\Amaze-Accessory-Brochure.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot robot = new Robot();
		
		robot.delay(2500);
		
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
}

	public static void main(String[] args) {
	    FileUpload upload = new FileUpload();
	    upload.initializeBrowser();
	    //upload.fileUploadUsingSendkeys();
        try {
			upload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}