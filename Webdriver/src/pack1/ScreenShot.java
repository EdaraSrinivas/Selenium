package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
	/*	TakesScreenshot screen = ((TakesScreenshot)driver);
		File src = screen.getScreenshotAs(OutputType.FILE);
	*/	
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src1, new File("./Screenshots/"+driver.getTitle()+".jpeg"));
		Thread.sleep(4000);
		driver.close();
		
	}

}
