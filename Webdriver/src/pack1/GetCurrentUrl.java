package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		
		// forgotten link
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(5000);
		
		// Validating with the URL of a page
		
		String expectedUrl = "recover";
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Test Passed --: It should opens the expected page");
		}
		else {
			System.out.println("Test Failed --: It should't opens the expected page");
		}
	}

}
