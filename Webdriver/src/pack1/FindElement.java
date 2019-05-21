package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		
		// Launch the Firefox Browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();

		// Launch the application
		
		driver.get("http://www.facebook.com");
		
		//Login
		
		//user-name
		driver.findElement(By.id("email")).sendKeys("srinivas");
		//password
		driver.findElement(By.name("pass")).sendKeys("sri@1234");
		//login-button
		driver.findElement(By.id("u_0_8")).click();
	}
}
