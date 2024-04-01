package testcase1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Calendar {
	
	WebDriver driver = new ChromeDriver();

	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	  

	  
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.xpath("//a[@value='BLR']")).click();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("(//a[text()=' Ahmedabad (AMD)'])[2]")).click();
	  

	  
	  driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
	  
	  
	  
	  
	  System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));  // to print attribute value

	  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

	  {

	  System.out.println("its enabled");

	  Assert.assertTrue(true);

	  }

	  else

	  {

	  Assert.assertTrue(false);

	  }

	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
