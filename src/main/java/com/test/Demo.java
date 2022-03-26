package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;
//import org.testng.annotations.Test;

public class Demo {

	/*
	 * public static void main(String[] args) {
	 * System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	 * //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 * //WebDriver driver = new ChromeDriver(); WebDriver driver = new
	 * FirefoxDriver(); driver.get("http://www.google.com");
	 * System.out.println(driver.getTitle()); driver.close();
	 * 
	 * 
	 * }
	 */
	
	public static void main(String[] args) { // TODO Auto-generated method stub 
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://www.linkedin.com/login"); 

		  WebElement username=driver.findElement(By.id("username")); 
		  WebElement password=driver.findElement(By.id("password")); 
		  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
		  username.sendKeys("example@gmail.com"); password.sendKeys("password"); 
		  login.click(); String actualUrl="https://www.linkedin.com/feed/"; 
		  String expectedUrl= driver.getCurrentUrl(); 
//		  Assert.assertEquals(expectedUrl,actualUrl); 
		  }

}
