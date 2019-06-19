package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies4 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		String expectedCookieName = "dat";
		
		// Verify the Cookies available or not?
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("There is no cookies for the application");
		}
		else {
			System.out.println("Cookies are avialable:"+cookie.size());
			
			System.out.println(driver.manage().getCookieNamed(expectedCookieName));
		}
		driver.close();
	}

}
