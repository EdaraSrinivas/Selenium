package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Link {

	public static void main(String[] args) {
	
		
		// Launch the Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("https://www.yahoomail.com");
		
		driver.findElement(By.id("createacc")).click();


	}

}
