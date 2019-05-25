package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		
		// forgotten link
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(5000);
		// Validating with the plain-text
		String expectedText = "Find Your Account";
		
		String actualText = driver.findElement(By.xpath("//div[@class='clearfix uiHeaderTop']/div[2]/h2")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test Passed --: It should opens the expected page");
		}
		else {
			System.out.println("Test Failed --: It should't opens the expected page");
		}
	}

}
