package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		// Dynamic WebTable
		
		WebElement table = driver.findElement(By.xpath("//table[@id='xxxx']/tbody"));
		
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		// row
		for(WebElement row: rows) {
			List<WebElement> columns = row.findElements(By.xpath("//td"));
			
			// Column
			for(WebElement column:columns) {
				String data = column.getText();
				System.out.println(data);
			}
		}
		

	}

}
