package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies8 {

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
			
			for(int i=0;i<cookie.size();i++) {
				String actualCookieName = cookie.get(i).getName();
				if(actualCookieName.equals(expectedCookieName)) {
					driver.manage().deleteCookie(cookie.get(i));
					System.out.println("Cookie deleted Successfully with the name:"+expectedCookieName);
					break;
				}
			}
		}
		driver.close();
	}
}
