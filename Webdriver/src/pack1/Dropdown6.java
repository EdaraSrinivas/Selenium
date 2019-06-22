package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown6 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://phptravels.org/register.php");
		
		String expectedCountry = "+61";
		
		WebElement countrycode = driver.findElement(By.className("selected-dial-code"));
		
		Actions action = new Actions(driver);
		
		action.click(countrycode).perform();
		Thread.sleep(4000);
		
		List<WebElement> countrylist = driver.findElements(By.xpath("//ul[@class='country-list dropup']/*"));
	
		for(WebElement country:countrylist) {
			String actualCountry = country.getText();
		
			if(actualCountry.contains(expectedCountry)) {
				action.click(country).perform();
				System.out.println("Selected Country:"+actualCountry);
				break;
			}
		}
	
		driver.close();
	}
}
