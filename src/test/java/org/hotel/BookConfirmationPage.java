package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmationPage extends BaseClass {
	
	public BookConfirmationPage() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="order_no")
	private WebElement orderNum;
	
	public WebElement getOrderNum() {
		return orderNum;
	}
	
	
}
