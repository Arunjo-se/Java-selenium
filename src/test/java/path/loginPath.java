package path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main1.Setup;

public class loginPath extends Setup {

	WebDriver driver;

	public loginPath(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
//	WebElement adminEmail = driver.findElement(By.name("username"));

	//----------- pageFactory---------

//	@FindBy(name ="username")
//	WebElement username1;


	By username = By.name("username");
	
	

	@FindBy(name = "password")   	//By passwordElement = By.name("password");
	WebElement passwordElement;
	
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement login;

	public void loginApplication(String enterUsername, String enterPassword)
	{
		Setup setup = new Setup(driver);
		
		setup.waitforElement(username);
		driver.findElement(username).sendKeys(enterUsername);

		

		
		passwordElement.sendKeys(enterPassword);
		//driver.findElement(passwordElement).sendKeys(password);
		
		login.click();
	}

}
