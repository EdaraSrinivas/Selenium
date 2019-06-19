package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_SIZE1 {

	public static void main(String[] args) throws InterruptedException {

		// Firefox Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.fb.com");
		System.out.println("Opening Size of Window:" + driver.manage().window().getSize());
		// Size of an Element
		Dimension s1 = driver.findElement(By.name("firstname")).getSize();
		// Position of an Element
		int x = driver.findElement(By.name("firstname")).getLocation().getX();
		int y = driver.findElement(By.name("firstname")).getLocation().getY();
		Thread.sleep(5000);

		// Change the size of window as per user requirement
		
		Dimension d = new Dimension(450, 550);
		driver.manage().window().setSize(d);
		// Size of an Element
		Dimension s2 = driver.findElement(By.name("firstname")).getSize();
		// Position of an Element
		int x1 = driver.findElement(By.name("firstname")).getLocation().getX();
		int y1 = driver.findElement(By.name("firstname")).getLocation().getY();
		Thread.sleep(5000);
		
		if(x==x1 && y==y1) {
			
			if(s1.equals(s2)) {
				System.out.println("The element co-ordinates are same: So, the page must be stable");
			}
			else {
				System.out.println("The element size is changed: So, The page not be stable");
			}
		}
		else {
			System.out.println("The element position is changed: So, The page not be stable");
		}
		driver.close();
	}
}
