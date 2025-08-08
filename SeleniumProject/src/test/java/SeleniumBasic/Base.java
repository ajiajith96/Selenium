package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");  //open url.
		driver.manage().window().maximize();   //maximize the url window.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Base base = new Base();
        base.initializeBrowser();
	}

}