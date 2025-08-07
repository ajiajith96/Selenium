package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.obsqurazone.com/");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base base = new Base();
        base.initializeBrowser();
	}

}