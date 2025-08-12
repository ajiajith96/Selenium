package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table;

public class TableHandling extends Base {
	
	public void verifyTable() {
	    driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement verify = driver.findElement(By.xpath("//table[@id='dataTable']"));
	    System.out.println(verify.getText());
	    
	    WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
	    System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		TableHandling table = new TableHandling();
		table.initializeBrowser();
		table.verifyTable();
	}

}
