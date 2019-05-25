package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		
		// Verifying the Re-enter email address field in a page
		
		String expectedElement = "Re-enter email address";
		
		String devCode = driver.getPageSource();
		
		if(devCode.contains(expectedElement)) {
			System.out.println("Test Passed --: Element is available in a page");
		}
		else {
			System.out.println("Test Failed --: Element is not available in a page");
		}
	}

}
