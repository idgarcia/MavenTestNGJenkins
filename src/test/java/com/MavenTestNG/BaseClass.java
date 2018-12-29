package com.MavenTestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "com.MavenTestNGJenkins/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Google");
	}


	

		
	}
		

