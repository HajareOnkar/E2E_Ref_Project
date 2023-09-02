package gnearicLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests  {
	public static WebDriver driver;
	public static PropertyFile pdata=new PropertyFile();
	
	
	@BeforeMethod
	public void beforeTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get(pdata.getPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	}
	 
	@AfterMethod
	public void afterTest(ITestResult result) throws IOException
	{
		int status = result.getStatus();
		String name=result.getName();
		
		if (status==1) {
			Screenshot sc=new Screenshot();
			sc.getScreenshot(driver,name);
			
		} 
		driver.close();
		driver.quit(); 
	}
	
	
	
}
