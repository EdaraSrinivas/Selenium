package dataDriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CSV_fb_login2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("E:\\testdata.txt");
		
		FileReader read = new FileReader(file);
		BufferedReader br =new BufferedReader(read);
		String data;
		data = br.readLine();
		
		while(data!=null) {
			
			System.out.println(data);
			
			String actdata[] = data.split(",");
			
			// Browser Launch
			WebDriver driver;
			
			if(actdata[0].equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(actdata[0].equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.river", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else if(actdata[0].equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "operadriver.exe");
				driver = new OperaDriver();
			}
			else if(actdata[0].equalsIgnoreCase("opera")) {
			
				driver = new SafariDriver();
			}
			else {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			// Application
			driver.get(actdata[1]);
			
			// Validate the login
			
			// UserId
			driver.findElement(By.id("email")).sendKeys(actdata[2]);
			// Password
			driver.findElement(By.name("pass")).sendKeys(actdata[3]);
			// login -button
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(3000);
			
			driver.close();
			
			data = br.readLine();
		}
		br.close();
	}
}
