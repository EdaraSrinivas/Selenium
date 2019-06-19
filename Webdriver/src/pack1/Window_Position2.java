package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Position2 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening position:" + driver.manage().window().getPosition());
		driver.get("http://www.fb.com");

		// Text Element
		String before = driver.findElement(By.xpath("//span[text()='Create an account']")).getCssValue("font-size");
		Thread.sleep(5000);

		// Change the Position of window as per user requirement

		Point position = new Point(75, 125);
		driver.manage().window().setPosition(position);

		// Text Element
		String after = driver.findElement(By.xpath("//span[text()='Create an account']")).getCssValue("font-size");
		Thread.sleep(5000);
		
		if(before.equals(after)) {
			System.out.println("The element font will be same: So, the page must be stable");
		}
		else {
			System.out.println("The element font will not be same: So, the page must not be stable");
		}
		driver.close();
	}
}
