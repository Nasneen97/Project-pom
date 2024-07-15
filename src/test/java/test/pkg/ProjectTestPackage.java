package test.pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.pkg.ProjectBaseClass;
import page.pkg.ProjectPageClass;

public class ProjectTestPackage extends ProjectBaseClass {
	
	@Test 
	public void verifyLoginWithValidCred() {
		
		ProjectPageClass pl = new ProjectPageClass(driver);
		pl.accountLogin();
		pl.setValues("nasneen1997@gmail.com", "Asif@123");
		pl.siginClick();
		pl.loginClick();
		pl.menButtonClick();
		pl.everydaysneakerLink();
		pl.firstshoeClick();
		pl.selectColor();
		pl.selectSize();
		pl.addToCart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
//		pl.continueShopping();
		driver.navigate().back();
		driver.navigate().back();
		pl.socksLink();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(500,0)");
		pl.firstLink();
		pl.socksizeClick();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(500,0)");
		pl.sockAddToCart();
		driver.navigate().back();
		driver.navigate().back();
		
		 List<WebElement> links = pl.getAllLinks();
		 for (WebElement link : links) {
	            System.out.println("Link Text: " + link.getText());
	            System.out.println("Link URL: " + link.getAttribute("href"));
	        }
		 
		 Assert.assertTrue(pl.isLogoDisplayed(), "The logo is not displayed.");
		 pl.SearchClick();
	
		 pl.searchText("women shoes");
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(500,0)");
		 pl.womenThirdShoe();
		 
		 
		 
		 
		
	}
	}


