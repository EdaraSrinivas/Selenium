package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception {
	
		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.hdfcbank.com/");
		
		// Login
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle());
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(winid.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		// Continue to NetBanking
		driver.findElement(By.xpath("//div[@class='full_container']/div[2]//a")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("login_page");
		Thread.sleep(5000);
		// User ID
		driver.findElement(By.name("fldLoginUserId")).sendKeys("64234198");
	}
}
