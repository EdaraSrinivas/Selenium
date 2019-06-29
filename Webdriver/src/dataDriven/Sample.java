package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.fb.com");

		Sample s = new Sample();
		s.login("sri", "sri@1234");
		s.login("ram", "ram@!234");
	}

	public void login(String user,String pwd) {
		// UserId
		driver.findElement(By.id("email")).sendKeys(user);
		// Password
		driver.findElement(By.name("pass")).sendKeys(pwd);
		// login -button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
