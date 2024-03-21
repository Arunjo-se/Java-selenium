package Reallifeexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {

	WebDriver driver = new ChromeDriver();

	@Test
	public void f() {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();

		System.out.println(
				driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());

		// isSelected is used to understand the checkbox selected or not

	}
}
