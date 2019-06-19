package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1559359505&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d3030b7f6-cea5-a2b0-e178-e09861cfc1dc&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
	
		// Validating the login Operation
		
		driver.findElement(By.name("loginfmt")).sendKeys("srinivased");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(4000);
		
		String expalertMsg = "That Microsoft account doesn't exist. Enter a different account or ";
		
		// Validating the username field with -ve case
		
		if(driver.findElement(By.id("usernameError")).isDisplayed()) {
			
			String actualAlertMsg = driver.findElement(By.id("usernameError")).getText();
			if(actualAlertMsg.contains(expalertMsg)) {
				System.out.println("Alert displays and Message is same as expected -- pass");
			}
			else {
				System.out.println("Alert displays but it shouldn't as expected -- fail");
			}
		}
		else {
			System.out.println("Alert msg is not displays-- fail");
		}
		driver.close();
	}

}
