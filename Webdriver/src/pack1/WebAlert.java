package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlert {

	public static void main(String[] args) {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String expectedMsg = "Please enter a valid user name";
		
		// -ve operation
		
		driver.findElement(By.name("proceed")).click();
		
	/*	String actualMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	*/	
		Alert alert = driver.switchTo().alert();
		String actualMsg = alert.getText();
		alert.accept();
		
		if(actualMsg.equals(expectedMsg)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		

	}

}
