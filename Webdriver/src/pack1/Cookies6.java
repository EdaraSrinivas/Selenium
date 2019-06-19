package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies6 {

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
			Thread.sleep(5000);
			driver.manage().deleteAllCookies();
			Thread.sleep(5000);
			int count = driver.manage().getCookies().size();
			
			if(count==0) {
				System.out.println("Cookies are deleted Successfully");
			}
			else {
				System.out.println("Cookies are not deleted Successfully:"+count);
			}	
		}
		
		driver.close();
	}
}
