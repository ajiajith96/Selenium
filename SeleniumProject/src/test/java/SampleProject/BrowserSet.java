package SampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSet {
	
	public WebDriver driver;
	public void initializeBrowser() {
	
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	}
	
	
	

	public static void main(String[] args) {
		BrowserSet browser = new BrowserSet();
		browser.initializeBrowser();

	}

}
