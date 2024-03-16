package path;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import main1.Setup;

public class DashboardPath extends Setup {

	WebDriver driver;

	public DashboardPath(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
