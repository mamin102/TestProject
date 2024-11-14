package com.selenium_new_feature;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewScreenShot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
				
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		
		File file = logo.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("logo.png");
		
		FileUtils.copyFile(file, destFile);
		
		
		driver.quit();
	}

}
