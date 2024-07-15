package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void facebook() {
		driver.findElement(By.id("email")).sendKeys("nasneen1997@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asif@123");
		driver.findElement(By.name("login")).click();
	}

}
