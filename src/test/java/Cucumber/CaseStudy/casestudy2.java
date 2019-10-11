package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class casestudy2 {
	WebDriver driver;
@Given("^user not logged in$")
public void user_not_logged_in() throws Throwable {
	 driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 
}

@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
	
	driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys(arg1);
	  driver.findElement(By.name("password")).sendKeys(arg2);
	  driver.findElement(By.name("Login")).click();
	  

}

@Then("^logged in Successfully$")
public void logged_in_Successfully() throws Throwable {
	Assert.assertEquals(driver.getTitle(), "Home");
	System.out.println("Logged in Successfully !!");
	driver.close();
}



}
