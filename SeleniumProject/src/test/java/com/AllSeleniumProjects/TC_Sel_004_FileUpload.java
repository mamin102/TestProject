package com.AllSeleniumProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Sel_004_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	
	
	driver.get("https://demo.guru99.com/test/upload/");
	
	driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]")).sendKeys("/Users/moamin/eclipse-workspace_new2020-06/SeleniumProject/Driver/Sifat.jpg");
	
	driver.findElement(By.xpath("//input[@class=\"field_check\"]")).click();
	
	
	driver.findElement(By.xpath("//button[contains(@name, \"send\")]")).click();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
	}
}
