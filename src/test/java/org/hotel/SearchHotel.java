package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LoginPage {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddLocation;
	
	@FindBy(name="hotels")
	private WebElement ddHotels;
	
	@FindBy(id="room_type")
	private WebElement ddRoomType;
	
	@FindBy(id="room_nos")
	private WebElement ddNor;
	
	@FindBy(name="datepick_in")
	private WebElement InDate;
	
	@FindBy(name="datepick_out")
	private WebElement OutDate;
	
	@FindBy(id="adult_room")
	private WebElement ddApr;
	
	@FindBy(name="child_room")
	private WebElement ddCpr;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch;

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getDdNor() {
		return ddNor;
	}

	public WebElement getInDate() {
		return InDate;
	}

	public WebElement getOutDate() {
		return OutDate;
	}

	public WebElement getDdApr() {
		return ddApr;
	}

	public WebElement getDdCpr() {
		return ddCpr;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void SearchHotels(String ddLocation,String ddHotels,String ddRoomType,String ddNor,String InDate,String OutDate,String ddApr,String ddCpr) {
	dropDownByText(getDdLocation(), ddLocation);
	dropDownByText(getDdHotels(), ddHotels);
	dropDownByText(getDdRoomType(), ddRoomType);
	dropDownByText(getDdNor(), ddNor);
	elementSendKeys(getInDate(), InDate);
	elementSendKeys(getOutDate(), OutDate);
	dropDownByText(getDdApr(), ddApr);
	dropDownByText(getDdCpr(), ddCpr);	
	ClickSearch();
	}
	
	public void ClickSearch() {
		elementClick(getBtnSearch());
	}
	
}
