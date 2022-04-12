package com.crm.pages.elements;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Base;

public class HomePageObjects extends Base {
	public HomePageObjects() throws IOException {
		PageFactory.initElements(driver, this);//to link the driver with elements
		
	}
	public
	@FindBy(id="main-nav")
	WebElement mainnav;
	public
	@FindBy(xpath=("//span[contains(text(),'Contacts')]"))
	WebElement contact;
	public
	@FindBy(xpath=("//div[@class='header item']"))
	WebElement homelogo;

	
    
	
}
