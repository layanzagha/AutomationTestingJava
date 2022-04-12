package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Base;
import com.crm.pages.elements.ContactPageObjects;
import com.crm.pages.elements.HomePageObjects;
import com.crm.pages.elements.LoginPageObjects;
import com.crm.pages.methods.ContactPageMethods;
import com.crm.pages.methods.HomePageMethods;
import com.crm.pages.methods.LoginPageMethods;


//I need to login first

public class ContactPageTest extends Base  {

	public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	LoginPageMethods loginPage;
	HomePageMethods homePage;
	ContactPageMethods contactPage;
	
	@BeforeMethod
	public void objects() throws IOException, InterruptedException {
		initialization();
	 loginPage = new LoginPageMethods();
	 homePage = new HomePageMethods();
	 contactPage = new ContactPageMethods();
	 Helper.email = "Layanzagha123@gmail.com";
	 Helper.password = "Layandana1234";
	 loginPage.performlogin(Helper.email,Helper.password);
	 homePage.clickoncontant();
	}
	
     @Test
	  public void checktoptitle(){
	 		
	 		Boolean actual=contactPage.gettoptitle();
	 		Assert.assertTrue(actual,"you are not at the contact page");
	 	
	 	}
	
	@Test
	  public void clickontecc(){
	 		contactPage.tecclick();
	 		Boolean actual=contactPage.getconfirmtitle();
	 		Assert.assertTrue(actual,"you don't click on the tec");
	 		System.out.println(actual);
	 		contactPage.cancleclick();
	 		Boolean actual2=contactPage.gettoptitle();
	 		Assert.assertTrue(actual2,"you don't click on the tec");
	 		System.out.println(actual2);
	 	}
	     

	@AfterMethod
	public void end(){
		teardown();
	}
	
}
