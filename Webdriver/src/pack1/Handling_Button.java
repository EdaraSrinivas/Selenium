package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * To Handle the button user can identify with the locators ( id, name, className, xpath and cssSelector)
 * After identifying the element uniquely user can operate with the click() method
 */

public class Handling_Button {

	public static void main(String[] args) {

		// Launch the Firefox Browser

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		// Launch the application

		driver.get("http://www.facebook.com");

		// SignUp
		driver.findElement(By.name("websubmit")).click();

	}

}
