package org.hotel;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class HotelDetails extends BaseClass {
	
	@BeforeClass
	public static void beforeclass() {
	getChromeDriver();
	maximizeWindow();
	implicitWait(20);
	enterAppInUrl("https://adactinhotelapp.com/");
	}
	@AfterClass
	public static void afterClass() {
		//closeWindow();
	}
	@Before
	public void before() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	
	@After
	public void after() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
	@Test
	
	public void tc1() {

		LoginPage loginpage = new LoginPage();
		WebElement txtUserName= loginpage.getTxtUserName();
		elementSendKeys(txtUserName, "prabhujo1710");
		WebElement txtPassword=loginpage.getTxtPassword();
		elementSendKeys(txtPassword, "Prabhu@123");
		WebElement btnLogin=loginpage.getBtnLogin();
		elementClick(btnLogin);
	}
	@Test
	
	public void tc2() {
		
		SearchHotel searchHotel=new SearchHotel();
		
		WebElement ddlocation = searchHotel.getDdLocation();
		elementSendKeys(ddlocation, "Sydney");
		
		WebElement ddHotels = searchHotel.getDdHotels();
		elementSendKeys(ddHotels, "Hotel Sunshine");
		
		WebElement ddRoomType = searchHotel.getDdRoomType();
		elementSendKeys(ddRoomType, "Deluxe");
		
		WebElement ddNor = searchHotel.getDdNor();
		elementSendKeys(ddNor, "2 - Two");
		
		
		WebElement InDate = searchHotel.getInDate();
		elementSendKeys(InDate, "1/12/2023");
		
		WebElement OutDate = searchHotel.getOutDate();
		elementSendKeys(OutDate, "1/13/2023");
		
		WebElement ddApr = searchHotel.getDdApr();
		elementSendKeys(ddApr, "1 - One");
		
		WebElement ddCpr = searchHotel.getDdCpr();
		elementSendKeys(ddCpr, "1 - One");
		
		WebElement btnSearch = searchHotel.getBtnSearch();
		elementClick(btnSearch);
	
	}
	
	@Test
	
	public void tc3() {

		SelectHotelPage selectHotel=new SelectHotelPage();
		
		WebElement btnClick = selectHotel.getBtnClick();
    	elementClick(btnClick);
    	
    	WebElement btnContinue = selectHotel.getBtnContinue();
    	elementClick(btnContinue);
	}
	
	@Test
	
	public void tc4() {

		BookHotelPage bookHotel=new BookHotelPage();
		
		WebElement firstName = bookHotel.getFirstNam();
    	elementSendKeys(firstName, "Jayaraj");
    	
    	WebElement lastName = bookHotel.getLastNam();
    	elementSendKeys(lastName, "Ramakrishnan");
    	
    	WebElement checkAddress = bookHotel.getCheckAddress();
    	elementSendKeys(checkAddress, "9,Pallavan Street,Chennai");
    	
    	WebElement creditNum = bookHotel.getCreditNum();
    	elementSendKeys(creditNum, "5451254132142515");
    	
    	WebElement ccvType = bookHotel.getCcvType();
    	elementSendKeys(ccvType, "Visa Card");
    	
    	WebElement expMonth = bookHotel.getExpMonth();
    	elementSendKeys(expMonth, "October");
    	
    	WebElement expYear = bookHotel.getExpYear();
    	elementSendKeys(expYear, "2024");
    	
    	WebElement cvvNum = bookHotel.getCvvNum();
    	elementSendKeys(cvvNum, "765");
    	
    	WebElement bookConfirm = bookHotel.getBookConfirm();
    	elementClick(bookConfirm);
	}
	
	@Test
	
	public void tc5() {
	
		BookConfirmationPage bookCon=new BookConfirmationPage();
				
				WebElement orderNum = bookCon.getOrderNum();
    	String attribute = orderNum.getAttribute("value");
    	System.out.println(attribute);
	}
}
