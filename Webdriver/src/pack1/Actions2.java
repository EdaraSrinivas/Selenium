package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.gmail.com");

		Actions action = new Actions(driver);
		WebElement forgotemail = driver.findElement(By.xpath("//button[text()='Forgot email?']"));

		// Left Click
		/*
		 * action.moveToElement(forgotemail).perform(); action.click().perform(); // OR
		 * action.click(forgotemail).perform();
		 */
		// Right Click
		action.moveToElement(forgotemail).perform();
		action.contextClick().perform();
				// OR
		action.contextClick(forgotemail).perform();

		// Double Click
		action.moveToElement(forgotemail).perform();
		action.doubleClick().perform();
				// OR
		action.doubleClick(forgotemail).perform();
		
	}
}
