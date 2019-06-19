package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) {

		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("file:///D:/multipleDropdown.html");
		
		String expectedValues[] = {"Audi","Toyoto","Nissan"};
		
		Select select = new Select(driver.findElement(By.id("cars")));
		
		List<WebElement> opt = select.getOptions();
		
		boolean flag = select.isMultiple();
		
		if(flag==true) {
			System.out.println("Multiple selection");
		
			for(int i=0;i<expectedValues.length;i++) {
				int k = 0;
				for(int j=0;j<opt.size();j++) {
					if(expectedValues[i].equals(opt.get(j).getText())) {
						select.selectByIndex(j);
						k = k+1;
						System.out.println(expectedValues[i]+": Selected");
						break;
					}
				}
				if(k==0) {
					System.out.println(expectedValues[i]+": is not available");
				}
			}	
		}
		else {
			System.out.println("Single Selection");
		}

	}

}
