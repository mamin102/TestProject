package com.AllSeleniumProjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Sel_002_Navigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
	
//		driver.navigate().to("https://demoqa.com/auto-complete");
//		
//		driver.navigate().back();
//		
//		Thread.sleep(5000);
//		
//		driver.navigate().forward();
		
		
	driver.get("http://www.google.com");
	WebElement searchBox = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		
	searchBox.sendKeys("SearchSomething");
	searchBox.sendKeys(Keys.ENTER);
	
	driver.quit();
	}

}
