package com.crm.pages.elements;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Base;

public class LoginPageObjects extends Base {

	public LoginPageObjects() throws IOException {
	PageFactory.initElements(driver, this);//to link the driver with elements
		
	}
	public
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;
	public
	@FindBy(name=("email"))
	WebElement email;
	public
	@FindBy(name=("password"))
	WebElement password;
	public
	@FindBy(xpath=("//div[@class='ui fluid large blue submit button']"))
	WebElement loginbutton;
	/*@FindBy(xpath=("//img[@class='img-responsive']"))
	WebElement logo;*/
	
	
	

	
	
	
	
}
