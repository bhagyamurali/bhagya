package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class casestudy1 {
WebDriver driver;
@Given("^User is in the registration page to register$")
public void user_is_in_the_registration_page_to_register() throws Throwable {
    driver = UtilityClass.openBrowser("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.findElement(By.linkText("SignUp")).click();
}

@When("^User enter \"([^\"]*)\"$")
public void user_enter(String arg1) throws Throwable {
	
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(arg1);
}

@When("^first name \"([^\"]*)\"$")
public void first_name(String arg1) throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(arg1);
   
}

@When("^last name \"([^\"]*)\"$")
public void last_name(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(arg1);
}

@When("^password \"([^\"]*)\"$")
public void password(String arg1) throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(arg1);
   
}

@When("^confpassword \"([^\"]*)\"$")
public void confpassword(String arg1) throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(arg1);
   
}

@When("^select gender$")
public void select_gender() throws Throwable {
	  driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click(); 

}

@When("^mail \"([^\"]*)\"$")
public void mail(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(arg1);
}

@When("^phno \"([^\"]*)\"$")
public void phno(String arg1) throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(arg1);
}

@When("^dob \"([^\"]*)\"$")
public void dob(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(arg1);
}

@When("^place \"([^\"]*)\"$")
public void place(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(arg1);
}

@When("^ques$")
public void ques() throws Throwable {
	 Select sel=new Select(driver.findElement(By.name("securityQuestion")));
	  sel.selectByIndex(1);
}


@When("^answer \"([^\"]*)\"$")
public void answer(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(arg1);
	
}

@Then("^user must be in registration page$")
public void user_must_be_in_registration_page() throws Throwable {
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	Assert.assertEquals(driver.getTitle(), "Login");
	System.out.println("Registrated in Successfully !!");
	driver.close();
}

}
