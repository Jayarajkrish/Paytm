package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnClick;
	
	@FindBy(name="continue")
	private WebElement btnContinue;

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
	public void Shotel() {
	elementClick(getBtnClick());
	elementClick(getBtnContinue());
	}
	 
	
	
		
		
	}
