package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1559359505&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d3030b7f6-cea5-a2b0-e178-e09861cfc1dc&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
	
		// Validating the login Operation
		
		driver.findElement(By.name("loginfmt")).sendKeys("srinivasedara");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
		
		// Validating the username field with +ve case
		
		if(driver.findElement(By.name("passwd")).isDisplayed()) {
			
			System.out.println("User data is valid");
		}
		else {
			System.out.println("User data is invalid");
		}
		driver.close();
	}

}
