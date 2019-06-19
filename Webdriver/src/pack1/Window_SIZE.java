package pack1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_SIZE {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.fb.com");
		System.out.println("Opening Size of Window:" + driver.manage().window().getSize());
		
		Thread.sleep(5000);
		Dimension size = new Dimension(450,250);
		driver.manage().window().setSize(size);
		Thread.sleep(5000);
		// Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}
