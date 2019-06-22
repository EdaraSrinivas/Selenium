package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown5 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://phptravels.org/register.php");
		
		WebElement countrycode = driver.findElement(By.className("selected-dial-code"));
		
		Actions action = new Actions(driver);
		
		action.click(countrycode).perform();
		Thread.sleep(4000);
		
		action.click(driver.findElement(By.xpath("//li[@data-country-code='in']"))).perform();
				
	}
}
