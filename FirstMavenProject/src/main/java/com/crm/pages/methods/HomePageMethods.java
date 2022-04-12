package com.crm.pages.methods;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.crm.base.Base;
import com.crm.pages.elements.ContactPageObjects;
import com.crm.pages.elements.HomePageObjects;


public class HomePageMethods extends Base {
	
	public HomePageMethods() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HomePageObjects home = new HomePageObjects();
	
	
public boolean logoisdisplayed(){
		
		boolean logoisdisplayed=home.homelogo.isDisplayed();
		return logoisdisplayed;
		
	
	}
    public String geturl(){
		
		String url=driver.getCurrentUrl();
		return url;
		
	
	}
    

     public String gettitle(){
		
		String title=driver.getTitle();
		return title;
		
	
	}
    
     public Boolean checklogo(){
 		
 		Boolean logo=home.homelogo.isDisplayed();
 		return logo;
 		
 	
 	}
     
  /*   public LoginPage clickoncontant() {
    	 
    	 Actions action=new Actions(driver);
    	 action.moveToElement(mainnav).build().perform();
    	 contact.click();
    	 return LoginPage;
    	 

     }*/
     
     
     public ContactPageObjects clickoncontant() throws IOException, InterruptedException {
 		
    	 Actions action=new Actions(driver);
    	 action.moveToElement(home.mainnav).build().perform();
    	 home.contact.click();
 		return new ContactPageObjects();//when the action move us to new page we have to put this statement
 		
 	
 	}
     
     public ContactPageObjects clickoncalender() throws IOException, InterruptedException {
  		
    	 Actions action=new Actions(driver);
    	 action.moveToElement(home.mainnav).build().perform();
    	 home.contact.click();
 		return new ContactPageObjects();//when the action move us to new page we have to put this statement
 		
 	
 	}
 	
}
