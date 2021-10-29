package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FoodBoxAdmin {

	
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
		driver.findElement(By.id("loginNav")).click();
		driver.findElement(By.id("email")).sendKeys("Admin@foodbox.com.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test (priority = 1)
	public void AdminOperations(){
		driver.findElement(By.id("addfoodButton")).click();
		driver.findElement(By.id("name")).sendKeys("TestItem");
		driver.findElement(By.id("price")).sendKeys("TestItem");
		driver.findElement(By.id("category")).sendKeys("Indian");
		driver.findElement(By.id("description")).sendKeys("testDescription");
		
		driver.findElement(By.id("productImage")).sendKeys("Test");
		driver.findElement(By.id("addproductButton")).click();
	}
	
	
}
