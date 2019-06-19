package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies3 {

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
			
			// Verify the cookie with the expected
			for(int i=0;i<cookie.size();i++) {
				String actualCookieName = cookie.get(i).getName();
				if(actualCookieName.equals(expectedCookieName)) {
					System.out.println("Cookie is avialble with the expected name:"+expectedCookieName);
					break;
				}
			}
		}
		driver.close();
	}

}
