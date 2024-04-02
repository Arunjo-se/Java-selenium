package testcase1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class AlertCase {

	WebDriver driver = new ChromeDriver();

	@Test
	public void f() {

		String Stext = "Test user";
		driver.findElement(By.xpath("//fieldset/input[@placeholder='Enter Your Name']")).sendKeys(Stext);
		driver.findElement(By.id("alertbtn")).click();

		System.out.println("alert box text " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//fieldset/input[@placeholder='Enter Your Name']")).sendKeys(Stext);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}

	@BeforeSuite
	public void beforeSuite() {

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@AfterSuite
	public void afterSuite() {
		// driver.quit();
	}

}
