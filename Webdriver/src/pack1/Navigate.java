package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
	//	driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		// To go to the previous page
		driver.navigate().back();
		Thread.sleep(5000);
		// TO go the forward page
		driver.navigate().forward();
		Thread.sleep(5000);
		// To refresh the active page
		driver.navigate().refresh();

	}

}
