package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement2 {

	public static void main(String[] args) {
		
		// Launch the Firefox Browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();

		// Launch the application
		
		driver.get("http://www.facebook.com");
		
		// Registration
		
		// Firstname
		driver.findElement(By.id("u_0_j")).sendKeys("sri");
		
		// Surname
		driver.findElement(By.name("lastname")).sendKeys("edara");
		
		// Mobile
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("356784335");
	//	driver.findElement(By.name("reg_email__")).sendKeys("24567889903");
		
		// password
		driver.findElement(By.name("reg_passwd__")).sendKeys("244561sfgfh");
		
		// Gender -- male
	//	driver.findElement(By.name("sex")).click();
	//	driver.findElement(By.id("u_0_7")).click();
		
		// SignUp
		driver.findElement(By.name("websubmit")).click();
		
		
	}
}
