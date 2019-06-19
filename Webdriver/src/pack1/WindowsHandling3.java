package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling3 {

	public static void main(String[] args) throws Exception {
	
		// Launch the browser
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.naukri.com/");
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=1;i<winid.size();i++) {
			
			// Switch the cursor to the window based on index
			driver.switchTo().window(winid.get(i));
			driver.close();
		}
	}
}
