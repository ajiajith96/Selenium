package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		
		WebElement frameheading =driver.findElement(By.id("id=\"sampleHeading\""));
		System.out.println(frameheading.getText());
		
	//	Back to default page content.
		driver.switchTo().defaultContent();
		
	}

	public static void main(String[] args) {
    HandlingFrames frames = new HandlingFrames();
    frames.initializeBrowser();
    frames.verifyFrames();
	}

}
