package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstNam;
	
	@FindBy(id="last_name")
	private WebElement lastNam;
	
	@FindBy(id="address")
	private WebElement checkAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditNum;
	
	@FindBy(id="cc_type")
	private WebElement ccvType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookConfirm;

	public WebElement getFirstNam() {
		return firstNam;
	}

	public WebElement getLastNam() {
		return lastNam;
	}

	public WebElement getCheckAddress() {
		return checkAddress;
	}

	public WebElement getCreditNum() {
		return creditNum;
	}

	public WebElement getCcvType() {
		return ccvType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookConfirm() {
		return bookConfirm;
	}
}
