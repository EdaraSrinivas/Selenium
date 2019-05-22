package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) throws InterruptedException {
	
		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// app
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		// Login
		driver.findElement(By.id("loginsubmit")).click();
		
		// Close the browser
	//	driver.close();
		driver.quit();
	}
}
