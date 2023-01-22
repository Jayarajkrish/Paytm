package org.hotel;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng extends BaseClass {
	
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
	(priority=-20)
	private void login() {
	LoginPage loginpage = new LoginPage();
	loginpage.login("prabhujo1710", "Prabhu@123");
	}
	
	@Test
	(priority=-15)
	private void SearchHotels() {
		SearchHotel hotel=new SearchHotel();
		hotel.SearchHotels("Sydney", "Hotel Sunshine", "Deluxe", "1 - One", "23/1/2023", "25/1/2023", "2 - Two", "1 - One");
		
	}
	
	@Test
	(priority=-10)
	private void Shotel() {
		SelectHotelPage selHot=new SelectHotelPage();
		selHot.Shotel();
	}
	
}
