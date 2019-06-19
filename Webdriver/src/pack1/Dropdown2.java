package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("file:///D:/multipleDropdown.html");
		
		Select select = new Select(driver.findElement(By.id("cars")));
		
		boolean flag = select.isMultiple();
		
		if(flag==true) {
			System.out.println("Multiple selection");
		}
		else {
			System.out.println("Single Selection");
		}

	}

}
