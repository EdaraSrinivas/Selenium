package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.facebook.com");
		
		// Day
		Select day = new Select(driver.findElement(By.id("day")));
		System.out.println(day.isMultiple());
		day.selectByVisibleText("23"); // external attribute value of the option tag
		
		day.deselectByVisibleText("23");
		day.selectByVisibleText("18");
		
		// Month
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		System.out.println(month.isMultiple());
		month.selectByIndex(2); // position in the drop-down
		
		// year
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		System.out.println(year.isMultiple());
		year.selectByValue("1997"); // internal attribute value of the option tag
		
		
		
		
		
		
		
		
		
		
		

	}

}
