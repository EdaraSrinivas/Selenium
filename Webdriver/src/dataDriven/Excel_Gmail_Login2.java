package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Excel_Gmail_Login2 {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		File filepath = new File("C:\\Users\\Srinivas\\Desktop\\Gmaildata.xlsx");

		FileInputStream fi = new FileInputStream(filepath);

		XSSFWorkbook book = new XSSFWorkbook(fi);

		XSSFSheet sheet = book.getSheet("login");

		int rows = sheet.getLastRowNum();

		for (int i = 1; i <= rows; i++) {

			String browserName = sheet.getRow(i).getCell(0).getStringCellValue();
			String appUrl = sheet.getRow(i).getCell(1).getStringCellValue();
			String username = sheet.getRow(i).getCell(2).getStringCellValue();
			String password = sheet.getRow(i).getCell(3).getStringCellValue();
			String expectedResult = sheet.getRow(i).getCell(4).getStringCellValue();

			// Launching Browser

			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "operadriver.exe");
				driver = new OperaDriver();
			} else if (browserName.equalsIgnoreCase("safari")) {

				driver = new SafariDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}

			// Launch the application
			driver.get(appUrl);

			// UserName
			driver.findElement(By.name("identifier")).sendKeys(username);
			// user-next
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(5000);
			
			// Validating Username with password
			if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) {
				// Password
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
				// password - next
				driver.findElement(By.id("passwordNext")).click();
				Thread.sleep(5000);
				
				// Validating the password with the title
				String title = driver.getTitle();
				if(title.contains(expectedResult)) {
					System.out.println("Test Pass");
				}
				else {
					String pwdWaringMsg = driver.findElement(By.xpath("//div[@class='xgOPLd']//span")).getText();
					if(pwdWaringMsg.contains(expectedResult)) {
						System.out.println("Test Pass");
					}
					else {
						System.out.println("Test Fail");
					}
				}
			}
			else {
				String userwaringMesg = driver.findElement(By.xpath("//div[@class='LXRPh']/div//div")).getText();
				if(userwaringMesg.equalsIgnoreCase(expectedResult)) {
					System.out.println("Test Pass");
				}
				else {
					System.out.println("Test Fail");
				}
			}
			driver.close();
			book.close();

		}
	}
}
