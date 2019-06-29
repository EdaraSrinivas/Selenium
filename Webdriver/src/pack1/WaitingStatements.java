package pack1;

import java.awt.AWTException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingStatements {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// ExplicitWait
		WebDriverWait wait = new WebDriverWait(driver,10);  // Seconds
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		// FluentWait
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);

	}

}
