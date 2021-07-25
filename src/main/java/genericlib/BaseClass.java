package genericlib;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public 	WebDriverUtilities utilities=new WebDriverUtilities();
	public WebDriver driver;
	public  Propertyfile p=new  Propertyfile();

	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void close(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		//we want to take screenshot of failed tc's
		if(status==2) {//if status =1>>it is for pass tc 
			//if status >>=2 it is for failed tc 
			//status >>=3 it for skip tc
			Screenshot s=new Screenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}


}
