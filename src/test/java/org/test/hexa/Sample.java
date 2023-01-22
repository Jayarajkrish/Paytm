package org.test.hexa;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
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
	public void tc1() throws IOException {
	WebElement id = findElementById("username");
	String FromCell = getDataFromcell("hotel", 3, 0);
	elementSendKeys(id, FromCell);
	
	WebElement Pass = findElementById("password");
	String dataFromcell = getDataFromcell("hotel", 3, 1);
	elementSendKeys(Pass, dataFromcell);
	
	WebElement btnLogin = findElementById("login");
	elementClick(btnLogin);
	
	WebElement txtUsername = findElementById("username_show");
	String attribute=txtUsername.getAttribute("value");
	writeCellData("hotel", 1, 9, attribute);
	boolean contains = attribute.contains("prabhujo1710!");
	Assert.assertTrue(contains);
	}	
	@Test
	public void tc2() throws IOException {
		WebElement loc = findElementById("location");
		String loca = getDataFromcell("hotel", 1,0);
		dropDownByText(loc, loca);
		
		WebElement loc1 = findElementById("hotels");
		String loca1 = getDataFromcell("hotel", 1,1);
		dropDownByText(loc1, loca1);
		
		WebElement loc2 = findElementById("room_type");
		String loca2 = getDataFromcell("hotel", 1,2);
		dropDownByText(loc2, loca2);
		
		WebElement loc3 = findElementById("room_nos");
		String loca3 = getDataFromcell("hotel", 1,3);
		dropDownByText(loc3, loca3);
		
		WebElement loc4 = findElementById("datepick_in");
		clearTextBox(loc4);
		String loca4 = getDataFromcell("hotel", 1,4);
		elementSendKeys(loc4, loca4);
		
		WebElement loc5 = findElementById("datepick_out");
		clearTextBox(loc5);
		String loca5 = getDataFromcell("hotel", 1,5);
		elementSendKeys(loc5, loca5);
	
		WebElement loc6 = findElementById("adult_room");
		String loca6 = getDataFromcell("hotel", 1,6);
		dropDownByText(loc6, loca6);
		
		WebElement loc7 = findElementById("child_room");
		String loca7 = getDataFromcell("hotel", 1,7);
		dropDownByText(loc7, loca7);
		
		WebElement btnSearch = findElementById("Submit");
		elementClick(btnSearch);
		
		WebElement before = findElementById("checkin_span");
		String text = before.getText();
		boolean contains = text.contains("before");
		Assert.assertTrue("verify before", contains);
		
		WebElement after = findElementById("checkout_span");
		String text2 = after.getText();
		boolean contains2 = text2.contains("after");
		Assert.assertTrue("verify after",contains2);
		
		clearTextBox(loc4);
		String inCel1 = getDataFromcell("hotel", 9, 4);
		elementSendKeys(loc4, inCel1);
		
		clearTextBox(loc5);
		String out1 = getDataFromcell("hotel", 9, 5);
		elementSendKeys(loc5, out1);
	
		WebElement search1 = findElementById("Submit");
		elementClick(search1);
	
	}
	@Test
	public void tc3() throws IOException {

		WebElement radio = findElementById("radiobutton_0");
		elementClick(radio);

		WebElement con = findElementById("continue");
		elementClick(con);

	}
	@Test
	public void tc4() throws IOException {
		WebElement firstName = findElementById("first_name");
		String first = getDataFromcell("hotel", 6, 0);
		elementSendKeys(firstName, first);

		WebElement lastName = findElementById("last_name");
		String lastNam = getDataFromcell("hotel", 6, 1);
		elementSendKeys(lastName, lastNam);

		WebElement address = findElementById("address");
		String add = getDataFromcell("hotel", 6, 2);
		elementSendKeys(address, add);

		WebElement cardNumber = findElementById("cc_num");
		String cardNum = getDataFromcell("hotel", 6, 3);
		elementSendKeys(cardNumber, cardNum);

		WebElement cardType = findElementById("cc_type");
		String cartype = getDataFromcell("hotel", 6, 4);
		elementSendKeys(cardType, cartype);

		WebElement expMonth = findElementById("cc_exp_month");
		String expMon = getDataFromcell("hotel", 6, 5);
		elementSendKeys(expMonth, expMon);

		WebElement expiryYear = findElementById("cc_exp_year");
		String expYear = getDataFromcell("hotel", 6, 6);
		elementSendKeys(expiryYear, expYear);

		WebElement ccvCard = findElementById("cc_cvv");
		String ccvNum = getDataFromcell("hotel", 6, 7);
		elementSendKeys(ccvCard, ccvNum);

		WebElement bookNow = findElementById("book_now");
		elementClick(bookNow);
	}
	@Test
	public void tc5() throws IOException {

		WebElement ordNum = findElementById("order_no");
		String num = ordNum.getAttribute("value");
		writeCellData("hotel", 1, 8, num);
	}


	}
	
	

	
	


