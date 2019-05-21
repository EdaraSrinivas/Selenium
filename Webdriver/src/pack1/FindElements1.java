package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements1 {

	public static void main(String[] args) {

		// Launch the Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("https://www.fb.com");
		
		// Collecting all the links of a page
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
	
		for(int i=0;i<link.size();i++) {
			
			String text = link.get(i).getText();
			System.out.println(i+"--"+text);
		}	
	}
}
