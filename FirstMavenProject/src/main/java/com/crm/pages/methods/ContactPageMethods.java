package com.crm.pages.methods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Base;
import com.crm.pages.elements.ContactPageObjects;

public class ContactPageMethods extends Base {
	
	
	ContactPageObjects cont = new ContactPageObjects();
	
	public ContactPageMethods() throws IOException {
		PageFactory.initElements(driver, this);//to link the driver with elements
	}

	
	
	
	
    public Boolean gettoptitle(){
		
		Boolean conttitle=cont.title.isDisplayed();
		return conttitle;
		
	
	}
    
 public Boolean getconfirmtitle(){
		
		Boolean confirm=cont.title.isDisplayed();
		return confirm;
		
	
	}
    
 public void tecclick(){
		
		cont.tecc.click();
	
		
	
	}
	
 public void cancleclick(){
		
		cont.cancle.click();
	
		
	
	}
	
	
	

}
