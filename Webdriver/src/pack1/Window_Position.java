package pack1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Position {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Default position of a window
		System.out.println("Default Size:"+driver.manage().window().getPosition());
		driver.get("http://www.fb.com");
		Thread.sleep(5000);
		// Changing the position as per user requirement
		Point position = new Point(75,100);
		driver.manage().window().setPosition(position);
		Thread.sleep(5000);
		driver.close();
	}
}
