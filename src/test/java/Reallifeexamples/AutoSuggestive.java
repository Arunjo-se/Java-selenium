package Reallifeexamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestive {

//	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();

	@Test
	public void f1() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

//		 List<WebElement> options =
//		 driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		 
			


		List<WebElement> options = driver.findElements(By.xpath(
				"//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]//li"));

		Thread.sleep(1000);
		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{
				Thread.sleep(3000);

				option.click();
				break;
			}
			
		}

		

	}
}
