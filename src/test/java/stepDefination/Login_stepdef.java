package stepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import gnearicLib.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Login_stepdef extends BaseClass {
	LoginPage loginpage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);

	@Given("User navigate to login screen")
	public void user_navigate_to_login_screen() throws IOException {

	}

	@When("User enters valid username")
	public void user_enters_valid_username() throws InterruptedException, IOException {
		// Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		loginpage.usernameTextBox();

	}

	@And("User enters valid password")
	public void user_enters_valid_password() {

		loginpage.passwordTextBox();

	}

	@And("User clicks on submit button")
	public void user_clicks_on_submit_button() {

		loginpage.submitbutton();

	}

	@Then("User navigate to home screen")
	public void user_navigate_to_home_screen() throws InterruptedException {
		Thread.sleep(30);

		homepage.successText();

	}

	@Then("user validate login massage")
	public void user_validate_login_massage() throws IOException {

		String expected1 = "Logged In Successfully";
		String actual1 = homepage.getvalue();

		Assert.assertEquals(actual1, expected1, "Value not matching");

	}
	
	
	@When("User enters invalid username {string}")
	public void user_enters_invalid_username(String username) {
		loginpage.enterUsername(username);
	    
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String password) {
	   loginpage.enterPassword(password);
	}

	@Then("User gets error {string} on login page")
	public void user_gets_error_on_login_page(String expectedError) throws InterruptedException {
	  String actualError=loginpage.getLoginError();
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  Assert.assertEquals(actualError, expectedError,"Incorrect error massage");
	

}
}
