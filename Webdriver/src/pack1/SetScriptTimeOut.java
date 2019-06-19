package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeOut {

	public static void main(String[] args) throws InterruptedException {
	
		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// SetScriptTimeOut
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		
		driver.get("http://www.fb.com");
		
		driver.findElement(By.name("userid")).sendKeys("Hi");
		
		driver.findElement(By.name("password")).sendKeys("Hello");
		
		driver.findElement(By.name("login")).click();
		// Here the SetScript timeout applicable
		driver.close();
		

	}

}
