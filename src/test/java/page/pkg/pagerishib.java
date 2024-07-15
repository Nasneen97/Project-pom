package page.pkg;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagerishib {
	
	WebDriver driver;
	
//	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a/span")
//	WebElement myaccount;
//	
//	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")
//	WebElement register;
//	
//	
//	
//	@FindBy(xpath = "//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")
//	WebElement name;
//	
//	@FindBy(xpath = "//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")
//	WebElement pass;
//	
//	@FindBy(xpath = "//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")
//	WebElement checkbox;
//	
//	@FindBy(xpath = "//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")
//	WebElement login;
//	
//	@FindBy(xpath = "//*[@id=\"ls-email-signin-overlay-v1\"]/div/div/div[1]/button")
//	WebElement close;
	
	@FindBy(xpath = "//*[@id=\"search\"]/input")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbutton;
	
	@FindBy(xpath = "//body/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/button[1]/span[1]")
	WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[4]/a")
	WebElement link;
	
	@FindBy(xpath = "//body/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/button[1]/span[1]")
	WebElement olevfairness;
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement allLink;
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement health;
	
	 @FindBy(tagName = "a")
	    List<WebElement> allLinks;
	
	
	
	
	public pagerishib(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getAllLinks() {
        return allLinks;
    }
	
//	public void myaccountDetails() {
//		myaccount.click();
//		
//	}
//	
//	public void registerClick() {
//		register.click();
//	}
//	
//	public void acceptAlert() {
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//    }
//	
//	
//	public void setValues(String arg1, String arg2) {
//		
//		name.sendKeys(arg1);
//		pass.sendKeys(arg2);
//		}
//	
//	public void checkboxClick() {
//		checkbox.click();
//	}
//	
//	public void loginClick() {
//		login.click();
//	}
//	
	
	
//	
//	public void windowclose() {
//		 close.click();
//	}
	
	public void searchText(String arg) {
		search.sendKeys(arg);
		
	}
	
	public void searchtextButton() {
		searchbutton.click();
	}
	
	public void whishlisttButton() {
		Actions actions = new Actions(driver);
        actions.moveToElement(wishlist).perform();
	}
	
	public void skinLink() {
		Actions actions = new Actions(driver);
        actions.moveToElement(link).perform();
	}
	
	public void skinfaieness() {
		olevfairness.click();
	}
	
	public void all() {
		allLink.click();
	}
	
	public void healthlink() {
		health.click();
	}
	
	
	
	
	
	
	

}
