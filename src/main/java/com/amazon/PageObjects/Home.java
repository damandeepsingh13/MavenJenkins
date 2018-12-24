package com.amazon.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.Commons.DriverInstance;


public class Home{
	
	WebDriver driver;
	public void clickLogin()
	{			
		DriverInstance dIns = new DriverInstance();
		driver = dIns.getDriverInstance();
		driver.findElement(By.xpath("//*[@class='nav-line-1'][text()='Hello. Sign in']")).click();

		
	}
}