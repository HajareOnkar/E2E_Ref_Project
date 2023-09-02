package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gnearicLib.PropertyFile;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement usernametb;

	@FindBy(id = "password")
	private WebElement passwordtb;

	@FindBy(id = "submit")
	private WebElement submitbtn;
	
	@FindBy(id="error")
	private WebElement error;

	WebDriver driver;
	private PropertyFile pfile=new PropertyFile();

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void usernameTextBox() throws IOException {

		usernametb.sendKeys(pfile.getPropertyFile("Username"));

	}

	public void passwordTextBox() {
		passwordtb.sendKeys("Password123");
	}

	public void submitbutton() {
		submitbtn.click();
	}

	
	
	public void enterUsername(String username)
	{
		usernametb.sendKeys(username);
		
	}
	public void enterPassword(String password)
	{
		usernametb.sendKeys(password);
		
	}
	public String getLoginError()
	{
		String actualerror=error.getText();
		return actualerror;
	}

	
	


}
