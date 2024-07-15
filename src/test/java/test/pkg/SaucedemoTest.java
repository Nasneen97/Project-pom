package test.pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.pkg.BaseClass;
import page.pkg.SaucedemoLogin;
import utilities.pkg.Excelutils;



public class SaucedemoTest extends BaseClass {
	
	@Test (priority = -1)
	public void verifyLoginWithValidCred() throws InterruptedException {
		SaucedemoLogin pl = new SaucedemoLogin(driver);
		
		String xl = "C:\\Users\\nasne\\Downloads\\saucedemo.xlsx";
		String Sheet = "Sheet1";
		int rowCount = Excelutils.getRowCount(xl,Sheet);
		System.out.println(rowCount);
		for(int i=1; i<=rowCount; i++) {
			String UserName = Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Email = "+Email);
			String Pwd = Excelutils.getCellValue(xl, Sheet,i,1);
			System.out.println("Password = "+Pwd);
			Thread.sleep(10000);
			
			
			pl.setValues(UserName, Pwd);
			pl.clickLogin();
			
			driver.navigate().back();
//			driver.navigate().back();
			driver.navigate().forward();
			
			driver.navigate().back();
          
			
			
			
		}
		

}
	@Test
	public void cartPage() throws InterruptedException{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Nasneen");
		driver.findElement(By.id("last-name")).sendKeys("ck");
		driver.findElement(By.id("postal-code")).sendKeys("676503");
		driver.findElement(By.id("continue")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}