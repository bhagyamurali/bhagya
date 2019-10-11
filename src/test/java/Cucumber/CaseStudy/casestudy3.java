package Cucumber.CaseStudy;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3 
{
	WebDriver driver;
	WebElement cart;
	WebDriverWait wait;

@Given("^open browser$")
public void open_browser() throws Throwable {
	driver = UtilityClass.openBrowser("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@When("^login and search for product$")
public void login_and_search_for_product() throws Throwable 
{
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	Assert.assertEquals("Login", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	Assert.assertEquals("Home", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Head");
    driver.findElement(By.name("products")).click();
    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    Assert.assertEquals("Search", driver.getTitle());
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    cart=driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label/i"));
    cart.click();
    driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
    driver.findElement(By.name("username")).sendKeys("123456");
    driver.findElement(By.name("password")).sendKeys("Pass@456");
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
    Assert.assertEquals(driver.getTitle(), "Order Details");
    driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]/i")).click();    
}

@Then("^Payment done$")
public void payment_done() throws Throwable 
{
	driver.close();
}

@Given("^again open browser$")
public void again_open_browser() throws Throwable
{
	driver = UtilityClass.openBrowser("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");      
}

@When("^login and search for product which is not available$")
public void login_and_search_for_product_which_is_not_available() throws Throwable 
{
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	Assert.assertEquals("Login", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	Assert.assertEquals("Home", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("hello");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    Assert.assertEquals( "Search",driver.getTitle());    
}

@Then("^payment unsuccessfull$")
public void payment_unsuccessfull() throws Throwable 
{
	System.out.println("product not available");
	driver.close();
    
}

@Given("^open browser again when blank$")
public void open_browser_again_when_blank() throws Throwable
{
	driver = UtilityClass.openBrowser("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");  
}

@When("^login and no search$")
public void login_and_no_search() throws Throwable
{
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	Assert.assertEquals("Login", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	Assert.assertEquals("Home", driver.getTitle() );
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("  ");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    Assert.assertEquals( "Search",driver.getTitle());    
}

@Then("^unsuccessfull when blank$")
public void unsuccessfull_when_blank() throws Throwable {
	System.out.println("Unsuccessful search");
	driver.close();
    
}
}
