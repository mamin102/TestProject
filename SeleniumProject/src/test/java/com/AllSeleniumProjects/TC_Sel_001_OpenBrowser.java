package com.AllSeleniumProjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Sel_001_OpenBrowser{

	static String titleHomePage = "Google"; 

	
	
	public static void main(String[] args) throws InterruptedException {
		//#1
		// manually write the code for instantiation of WebDriver :
	System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");

			
			//#2
			//WebDriverManager
			
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String actualTitle = driver.getTitle() ;
		System.out.println(actualTitle);
				
		if (titleHomePage.equals(actualTitle)){
	
			System.out.println("Please Procced on searching...");

		} 
		else {
			
			System.out.println("Land on wrong page Please check the URL");

		}
		
		Thread.sleep(5000);
		driver.quit();
	
	}

}
