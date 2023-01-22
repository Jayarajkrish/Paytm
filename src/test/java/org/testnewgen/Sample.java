package org.testnewgen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	@BeforeClass
	private void browser() {
		getChromeDriver();
		maximizeWindow();
		implicitWait(20);
		enterAppInUrl("https://adactinhotelapp.com/");
	}
	
	@AfterClass
	private void afterClass() {
		//closeWindow();
	}
	
	@BeforeMethod
	private void beforeMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	
	@AfterMethod
	private void afterMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	
	
	@Test
	private void login() {
	LoginPage loginpage=new LoginPage();
	//loginpage.login("12345" , "Hello@123");
	
	
		
	}
	
	@Test
	private void searchHotel() {
	}

}
