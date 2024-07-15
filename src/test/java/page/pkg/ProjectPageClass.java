package page.pkg;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class ProjectPageClass {
	
	WebDriver driver;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/ul[2]/li[5]/div[1]/a[1]")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='CustomerEmail']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='CustomerPassword']")
	WebElement password;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[5]")
	WebElement sigin;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/div[1]/a[1]")
	WebElement logo;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/ul[1]/li[1]/div[1]/button[1]")
	WebElement men;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement everydaysnekers;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[@id='parent-collection-container']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement firstsneaker;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	WebElement color;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[7]/button[1]")
	WebElement size;
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"anytime-no-show-sock-basin-blue\"]/div[21]/div/div/div[1]/div[2]/div[2]/div/button")
	WebElement continueshop;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/ul[1]/li[4]/div[1]/a[1]")
	WebElement socks;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement firstsocks;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[4]/button[1]")
	WebElement socksize;
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	WebElement sockAdd;
	
	@FindBy(tagName = "a")
    List<WebElement> allLinks;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/div[1]/a[1]/div[1]")
	WebElement logoprsent;
	
	@FindBy(xpath = "//body/div[@id='top-navigation-container']/div[1]/div[2]/nav[1]/ul[2]/li[4]/a[1]")
	WebElement search;
	
	@FindBy(xpath = "//input[@id='SearchBarMinimal__input']")
	WebElement searchfield;
	
	@FindBy(xpath = "//body/main[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement womenshoe;
	
    public ProjectPageClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    public List<WebElement> getAllLinks() {
        return allLinks;
    }
    
    public void accountLogin() {
    	login.click();
    }
    
    public void setValues(String arg1, String arg2) {
    	email.sendKeys(arg1);
    	password.sendKeys(arg2);
    }
    
    public void siginClick() {
    	sigin.click();
    }
    
    public void loginClick() {
    	logo.click();
    }
    
    public void menButtonClick() {
    	men.click();
    }
    
    public void everydaysneakerLink() {
    	Actions actions = new Actions(driver);
        actions.moveToElement(everydaysnekers).perform();
        everydaysnekers.click();
    }
    
    public void firstshoeClick() {
    	firstsneaker.click();
    }
    
    public void selectColor() {
    	color.click();
    }
    
    public void selectSize() {
    	size.click();
    }
    
    public void addToCart() {
    	cart.click();
    }
    
//    public void acceptAlert() {
//      Alert alert = driver.switchTo().alert();
//    
//      alert.accept();
//    }
    
    public void continueShopping() {
    	continueshop.click();
    }
    
    public void socksLink() {
    	socks.click();
    }
    
    public void firstLink() {
    	firstsocks.click();
    }
    
    public void socksizeClick() {
    	socksize.click();
    }
    
    public void sockAddToCart() {
    	sockAdd.click();
    }
    
    public boolean isLogoDisplayed() {
        return logoprsent.isDisplayed();
    }
    
    public void SearchClick() {
		search.click();
		
	}
    
    public void searchText(String arg) {
    	searchfield.sendKeys(arg);
    }
    
    public void womenThirdShoe() {
    	womenshoe.click();
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
