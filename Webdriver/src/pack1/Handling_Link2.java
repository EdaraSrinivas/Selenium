package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Link2 {

	public static void main(String[] args) {
	
		
		// Launch the Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("https://www.fb.com");
		
	//	driver.findElement(By.linkText("Forgotten account?")).click();

	//	driver.findElement(By.linkText("Why do I need to provide my date of birth?")).click();
		
	//	driver.findElement(By.partialLinkText("Why do I need to provide ")).click();
		
	//	driver.findElement(By.partialLinkText("my date of birth?")).click();
		
		driver.findElement(By.partialLinkText("I need to provide")).click();
	}

}
