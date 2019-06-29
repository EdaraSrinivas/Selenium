package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://jqueryui.com/draggable/");

		Actions action = new Actions(driver);

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		for (int i = 0; i < frames.size(); i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);

			if (driver.findElement(By.id("draggable")).isDisplayed()) {
				System.out.println("Element is found in frame:" + i);
				break;
			} else {
				continue;
			}
		}

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		
		int x = sourceEle.getLocation().getX();
		int y = sourceEle.getLocation().getY();
		
		action.dragAndDropBy(sourceEle, x+50, y+50).perform();

	}
}
