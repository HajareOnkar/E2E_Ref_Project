package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//h1[@class='post-title']")
	private WebElement success_text;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); 
	}
	
	public void successText()
	{
		System.out.println(success_text.getText());
		
	}
	
	public String getvalue()
	{
		String gv=success_text.getText();
		return gv;
	}

}
