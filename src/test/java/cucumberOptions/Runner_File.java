package cucumberOptions;

import gnearicLib.BaseClass;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="Featurefile",
		glue = "stepDefination",
		tags = "@positive",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)



public class Runner_File extends BaseClass {

}
