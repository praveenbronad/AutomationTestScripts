/**
 * 
 */
package genericUtilLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Praveen B Ronad
 *
 */
public class StepGroup {
	public WebDriver driver;
	PropertyFile p= new PropertyFile();
	
	@BeforeMethod
	public void openApplication() throws Throwable
	{
		// set up firefox driver 
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();// launch firefox browser
		driver.manage().window().maximize();
		driver.get(p.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}
	
}
