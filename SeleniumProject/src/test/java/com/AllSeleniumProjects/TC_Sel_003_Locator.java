package com.AllSeleniumProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Sel_003_Locator {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.google.com/");
		WebElement searchBox = 	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		
		searchBox.sendKeys("guru99 dami website for testing");
		
		
		//searchBox.sendKeys(Keys.ENTER);
		//or
		driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]")).click();
			
			Thread.sleep(5000);
			
			driver.quit();
		
	}

}
