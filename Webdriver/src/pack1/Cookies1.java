package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies1 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		// Verify the Cookies available or not?
		System.out.println(driver.manage().getCookies());
		
		System.out.println("Available Cookies:"+driver.manage().getCookies().size());
		

	}

}
