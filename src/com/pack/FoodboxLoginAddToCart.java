package com.pack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoodboxLoginAddToCart {

	WebDriver driver;
	
	@BeforeClass
	public void testSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Desktop data\\Spring boot\\UpdatedChromeFolder\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void openBrowser() {
		driver.get("http://localhost:8581/");
	}
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.id("loginNav")).click();
		driver.findElement(By.id("email")).sendKeys("shimpibhushan6@gmail.com");
		driver.findElement(By.id("password")).sendKeys("IndianArmy@1");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		driver.findElement(By.id("food")).sendKeys("idl");
		driver.findElement(By.id("searchKey")).click();
	}
	
	@Test(priority = 3)
	public void AddToCart() {
		driver.findElement(By.id("orderButton")).click();
	}
	
	@Test(priority = 4)
	public void CheckoutOperations() {
		driver.findElement(By.className("cart")).click();
		driver.findElement(By.id("checkoutButton")).click();
	}
	
	@Test(priority = 5)
	public void paymentGateway() {
		driver.findElement(By.id("paynowButton")).click();
	}

	
	
}
