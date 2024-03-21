package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import main1.Setup;

public class DashboardPath extends Setup {

	WebDriver driver;

	public DashboardPath(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	;

	By dasgbordName = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	
	
	

	public void titleTest(String titleName) {

		// OrangeHRM
		Assert.assertEquals(titleName, driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void textCheck(String text1) throws InterruptedException {
			
		Thread.sleep(2000);
		String dashboard = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
		System.out.println(dashboard);
		
		Assert.assertEquals(text1, "Dashboard");
	}

}
