package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		
	//	driver.findElement(By.xpath("//a[@class='h-c-button h-c-header__cta-li-linkh-c-header__cta-li-link--primary']")).click();
		
	//	driver.findElement(By.xpath("//a[@href='https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-n-en']]")).click();
		
		driver.findElement(By.xpath("(//li[@class='h-c-header__cta-li h-c-header__cta-li--primary'])[2]/a")).click();
		
	
	}

}
