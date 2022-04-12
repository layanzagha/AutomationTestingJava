package com.crm.pages.elements;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Base;

public class ContactPageObjects extends Base{
	
	public ContactPageObjects() throws IOException {
		PageFactory.initElements(driver, this);//to link the driver with elements
	}
	public
	@FindBy(xpath="//i[@class='checkmark icon']")
	WebElement tecc;
	public
	@FindBy(xpath=("//button[@class='ui button']"))
	WebElement cancle;
	
	@FindBy(id="main-nav")
	public
	WebElement mainnav;
	
	@FindBy(xpath  ="//div[@class='ui header item mb5 light-black']")
	public
	WebElement title;
	public
	@FindBy(xpath  ="//div[@class='header']")
	WebElement confirm;
	
	

	
	

}
