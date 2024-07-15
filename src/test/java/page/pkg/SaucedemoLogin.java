package page.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoLogin {
	
WebDriver driver;
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	 public SaucedemoLogin(WebDriver driver) { 
		// TODO Auto-generated constructor stub
	 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues(String sauceusername, String saucepassword) {
		username.sendKeys(sauceusername);
		pwd.sendKeys(saucepassword);
	}
	
	public void clickLogin() {
		login.click();
	}



	


}
