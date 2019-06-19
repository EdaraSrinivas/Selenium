package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm0&ogbl']")).click();
		
		driver.findElement(By.xpath(".//a[text()='Gmail']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//a[text()='Create an account']")).click();
		
		driver.findElement(By.xpath(".//a[starts-with(text()='Create an')]")).click();
		
		driver.findElement(By.xpath(".//a[ends-with(text()='account')]")).click();
		
		driver.findElement(By.xpath("//a[contains()]"));
	}

}
