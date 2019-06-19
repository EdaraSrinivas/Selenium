package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplitlyWait1 {

	public static void main(String[] args) throws InterruptedException {
	
		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.fb.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Hi");
		
		driver.findElement(By.name("lastname")).sendKeys("Hello");
		
		driver.close();
		

	}

}
