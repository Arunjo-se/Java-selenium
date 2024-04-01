package Reallifeexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import path.loginPath;

public class noOflinks {

	WebDriver driver = new ChromeDriver();
	loginPath loginPath = new loginPath(driver);

	@Test
	public void f() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPath.loginApplication("Admin", "admin123");

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// number of links
		Thread.sleep(5000);
		System.out.println("no of links: " + driver.findElements(By.tagName("a")).size());

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		Thread.sleep(5000);

		WebElement leftmenu = driver.findElement(By.xpath("//div[@class=\"oxd-sidepanel-body\"]"));

		System.out.println("left menu link count: " + leftmenu.findElements(By.tagName("a")).size());

		List<WebElement> leftside = leftmenu.findElements(By.tagName("a"));

		for (WebElement leftside1 : leftside) {
			System.out.println(leftside1.getText());

		}
		
		driver.quit();

	}
}
