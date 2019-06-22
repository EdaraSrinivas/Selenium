package pack1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.gmail.com");
		
		driver.switchTo().activeElement().sendKeys("srinivasedara");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		action.keyDown(Keys.ALT).sendKeys(Keys.F4).build().perform();
		action.keyUp(Keys.ALT).perform();
		
		

	}

}
