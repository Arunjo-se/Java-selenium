package testcase1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	WebDriver driver = new ChromeDriver();

  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//div[@class='space-y-2']//input")).sendKeys("opus@mailinator.com");
	  driver.findElement(By.xpath("//div[@class='relative']//input")).sendKeys("Opus@123");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//div[@class='p-6 flex flex-row items-center justify-between space-y-0 pb-2']//h3[text()='Pages']")).click();
  }
  
  @Test
  public void f1() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	//  Thread.sleep(2000);

	  //driver.findElement(By.xpath("//section//div//a[3]")).click();
	  
	  driver.findElement(By.xpath("//section//div//a[3]//h3[text()='Pages']")).click();

  }
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  driver.get("https://staging-admin.opuscompounds.com/auth/login");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
