package org.testlogin;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Employee {
	
	public static void main(String[] args) throws IOException {
		Employee employee=new Employee();
		employee.booking();
	}
private void booking() throws IOException {
	BaseClass baseclass=new BaseClass();
	ExcelDatas datas=new ExcelDatas();
	
	baseclass.getDriver();
	baseclass.enterAppInUrl("http://adactinhotelapp.com/SelectHotel.php");
	baseclass.maximizeWindow();
	
	WebElement txtUserName = baseclass.findElementById("username");
	String name = datas.getDataFromcell("hotel", 3, 0);
	baseclass.elementSendKeys(txtUserName, name);
	
	WebElement txtPassword = baseclass.findElementById("password");
	String pass = datas.getDataFromcell("hotel", 3, 1);
	baseclass.elementSendKeys(txtPassword, pass);
	
	WebElement btnLogin = baseclass.findElementById("login");
	baseclass.elementClick(btnLogin);
	
	WebElement loc = baseclass.findElementById("location");
	String place = datas.getDataFromcell("hotel", 1, 0);
	baseclass.elementSendKeys(loc, place);
	
	WebElement selHotel= baseclass.findElementById("hotels");
	String hotel = datas.getDataFromcell("hotel", 1, 1);
	baseclass.elementSendKeys(selHotel, hotel);
	
	WebElement rooms = baseclass.findElementById("room_type");
	String room = datas.getDataFromcell("hotel", 1, 2);
	baseclass.elementSendKeys(rooms, room);
	
	WebElement dateFrom = baseclass.findElementById("datepick_in");
	String fromcell = datas.getDataFromcell("hotel", 1, 3);
	baseclass.elementSendKeys(dateFrom, fromcell);
	
	WebElement dateOut = baseclass.findElementById("datepick_out");
	String outCell = datas.getDataFromcell("hotel", 1, 4);
	baseclass.elementSendKeys(dateOut, outCell);
	
	WebElement adultRoom = baseclass.findElementById("adult_room");
	String adult = datas.getDataFromcell("hotel", 1, 5);
	baseclass.elementSendKeys(adultRoom, adult);
	
	WebElement childRoom = baseclass.findElementById("child_room");
	String child = datas.getDataFromcell("hotel", 1, 6);
	baseclass.elementSendKeys(childRoom, child);
	
	WebElement search = baseclass.findElementById("Submit");
	baseclass.elementClick(search);
	
	WebElement radio = baseclass.findElementById("radiobutton_0");
	baseclass.elementClick(radio);
	
	WebElement continu = baseclass.findElementById("continue");
	baseclass.elementClick(continu);
	
	WebElement firstName = baseclass.findElementById("first_name");
	String firstNam = datas.getDataFromcell("hotel", 6, 0);
	baseclass.elementSendKeys(firstName, firstNam);
	
	WebElement lastName = baseclass.findElementById("last_name");
	String lastNam = datas.getDataFromcell("hotel", 6, 1);
	baseclass.elementSendKeys(lastName, lastNam);
	
	WebElement address = baseclass.findElementById("address");
	String add = datas.getDataFromcell("hotel", 6, 2);
	baseclass.elementSendKeys(address, add);
	
	WebElement cardNumber = baseclass.findElementById("cc_num");
	String cardNum = datas.getDataFromcell("hotel", 6, 3);
	baseclass.elementSendKeys(cardNumber, cardNum);
	
	WebElement cardType = baseclass.findElementById("cc_type");
	String cartype = datas.getDataFromcell("hotel", 6, 4);
	baseclass.elementSendKeys(cardType, cartype);
	
	WebElement expMonth = baseclass.findElementById("cc_exp_month");
	String expMon = datas.getDataFromcell("hotel", 6, 5);
	baseclass.elementSendKeys(expMonth, expMon);
	
	WebElement expiryYear = baseclass.findElementById("cc_exp_year");
	String expYear = datas.getDataFromcell("hotel", 6, 6);
	baseclass.elementSendKeys(expiryYear, expYear);
	
	WebElement ccvCard = baseclass.findElementById("cc_cvv");
	String ccvNum = datas.getDataFromcell("hotel", 6, 7);
	baseclass.elementSendKeys(ccvCard, ccvNum);
	
	WebElement bookNow = baseclass.findElementById("book_now");
	baseclass.elementClick(bookNow);
	
	baseclass.implicitWait(20);
	
	WebElement orderId = baseclass.findElementById("order_no");
	String attribute = orderId.getAttribute("value");
	datas.writeCellData("hotel", 1, 8, attribute);
	
	
	//baseClass.quiteWindow();

	
}



}
	
	
