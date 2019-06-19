package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies5 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();

		// app
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		// Verify the Cookies available or not?
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("There is no cookies for the application");
		}
		else {
			System.out.println("Cookies are avialable:"+cookie.size());
		}
		
		Cookie cookieinfo = new Cookie("abc","abc@12345");
		Thread.sleep(4000);
		driver.manage().addCookie(cookieinfo);
		
		System.out.println(driver.manage().getCookies().size());
		System.out.println(driver.manage().getCookieNamed("abc"));
		driver.close();
	}
}
