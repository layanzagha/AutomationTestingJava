package com.crm.pages.methods;

import java.io.IOException;

import com.crm.base.Base;
import com.crm.pages.elements.HomePageObjects;
import com.crm.pages.elements.LoginPageObjects;

public class LoginPageMethods extends Base{
	
	LoginPageObjects loginn = new LoginPageObjects();

	public LoginPageMethods() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String geturl(){                                                
		String actualurl=driver.getCurrentUrl();
		return actualurl;
	
	}
	
	public String gettitle(){
		String actualurl=driver.getTitle();
		return actualurl;
	
	}
	
	
	public LoginPageObjects clickonlogin() throws IOException{
		loginn.login.click();
		return new LoginPageObjects();
	
	}
	
	
     public HomePageMethods login(String emaill, String pass) throws IOException, InterruptedException {
		
    	loginn.email.sendKeys(emaill);
	    //Thread.sleep(3000);
    	loginn.password.sendKeys(pass);
		//Thread.sleep(4000);
    	loginn.loginbutton.click();
		return new HomePageMethods();//when the action move us to new page we have to put this statement
		
	
	}
     
     public HomePageMethods performlogin(String emaill, String pass) throws IOException, InterruptedException {
 		
    	 loginn.login.click();
    	 loginn.email.sendKeys(emaill);
	    //Thread.sleep(3000);
    	 loginn.password.sendKeys(pass);
		//Thread.sleep(4000);
    	 loginn.loginbutton.click();
 		return new HomePageMethods();//when the action move us to new page we have to put this statement
 		
 	
 	}

}
