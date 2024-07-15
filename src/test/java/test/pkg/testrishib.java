package test.pkg;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.pkg.BaseRishib;

import page.pkg.pagerishib;


public class testrishib extends BaseRishib{
	

	@Test 
	public void verifyLoginWithValidCred() {
		
		pagerishib pl = new pagerishib(driver);
//		pl.myaccountDetails();
//		pl.registerClick();
//		
//		pl.setValues("nazminmn1997@gmail.com", "Asif@123");
//		
//		
//		pl.checkboxClick();
//		pl.loginClick();
		
		pl.searchText("herbal agro growth booster");
		pl.searchtextButton();
		
		pl.whishlisttButton();
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(500,0)");
		 pl.skinLink();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 pl.skinfaieness();
		 
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,500)");
		 
		 pl.all();
		 pl.healthlink();
		
		 List<WebElement> links = pl.getAllLinks();
		 for (WebElement link : links) {
	            System.out.println("Link Text: " + link.getText());
	            System.out.println("Link URL: " + link.getAttribute("href"));
	        }
	
		
		
	}
	

}
	

