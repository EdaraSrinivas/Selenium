package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements2 {

	public static void main(String[] args) {
	
		// Launch the Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("https://www.fb.com");
		// Collecting text-boxes and radio-buttons
		System.out.println(driver.findElements(By.tagName("input")).size());
		
		List<WebElement> element = driver.findElements(By.tagName("input"));
		
		int tb = 0;
		int rb = 0;
		
		for(int i=0;i<element.size();i++) {
			
			if(element.get(i).getAttribute("type").equals("text")) {
				tb = tb +1;
			}
			else if(element.get(i).getAttribute("type").equals("email")) {
				tb = tb +1;
			}
			else if(element.get(i).getAttribute("type").equals("password")) {
				tb = tb +1;
			}
			else if(element.get(i).getAttribute("type").equals("radio")) {
				rb = rb +1;
			}
		}
		System.out.println("Total no.of text-boxes are:"+tb);
		System.out.println("Total no.of radio-buttons are:"+rb);
	}
}
