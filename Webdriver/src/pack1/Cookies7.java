package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies7 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		String expectedCookieName = "datr";
		
		// Verify the Cookies available or not?
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("There is no cookies for the application");
		}
		else {
			System.out.println("Cookies are avialable:"+cookie.size());
			Thread.sleep(5000);
			driver.manage().deleteCookieNamed(expectedCookieName);
			Thread.sleep(5000);
			
			Cookie flag = driver.manage().getCookieNamed(expectedCookieName);
			
			if(flag==null) {
				System.out.println("Cookie is deleted Successfully");
			}
			else {
				System.out.println("Cookie was not deleted Successfully:");
			}	
		}
		driver.close();
	}
}
