package com.amazon.Tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.Commons.DriverInstance;
import com.amazon.PageObjects.Home;



public class HomeTest
{
	WebDriver getdriver = null;
	
	 @BeforeClass
	  public void beforeClass()
	  {
		  
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		 // driver.quit();
	  }
	  
	  @Test
	  public void loginTest() throws InterruptedException, AWTException
	  {
		  System.out.println("Inside Test");
		  Home home = new Home();
		  home.clickLogin();
	  }
}
