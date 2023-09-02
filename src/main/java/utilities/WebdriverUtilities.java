package utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	
	//Drop down
	public void dropdown(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
		
	}
	
	//Actions
	public void mouseHour(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement trg)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src,trg);
	}
    
	
	//Frames
	public void switchFrame(WebDriver driver, String index)
	{
		driver.switchTo().frame(index);
	
	}
	public void switchBackToFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//Tab
	
	public void switchToTab(WebDriver driver)
	{
		Set<String> clild = driver.getWindowHandles();
		for (String c : clild) {
			driver.switchTo().window(c);
						
		}
		
			}
	//scroll bar
	public void scrollbar(WebDriver driver, int x, int y )
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy("+x+","+y+")");
	}
	
	
	//Pop up
			public void aleartPopup(WebDriver driver)
			{
				driver.switchTo().alert().accept();
				
			}
	
}
