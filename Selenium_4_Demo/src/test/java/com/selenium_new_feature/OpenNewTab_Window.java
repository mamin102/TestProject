package com.selenium_new_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab_Window {
	
	
	public static void openTab() throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	static void openWindow () throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	public static void getLocation() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		
		
		System.out.println("height = "+ logo.getRect().getDimension().getHeight());
		System.out.println("width = "+ logo.getRect().getDimension().getWidth());
		
		System.out.println("X = "+ logo.getRect().getX());
		System.out.println("Y = "+logo.getRect().getY());
		
	
		driver.quit();

		
	}
	
public static void main(String[] args) throws InterruptedException {
		
		//OpenNewTab_Window.openWindow();
		
		OpenNewTab_Window.getLocation();

	}

}
