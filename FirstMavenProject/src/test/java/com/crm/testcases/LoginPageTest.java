package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.base.Base;
import com.crm.pages.elements.HomePageObjects;
import com.crm.pages.elements.LoginPageObjects;
import com.crm.pages.methods.ContactPageMethods;
import com.crm.pages.methods.HomePageMethods;
import com.crm.pages.methods.LoginPageMethods;

//it is important to get rid of all 'driver.' and all Webelements//
public class LoginPageTest extends Base{
	
	
	String email;
	String password;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPageMethods loginPage;
	HomePageMethods homePage;
	ContactPageMethods contactPage;
	
/*	@BeforeSuite
	public void objects() throws IOException {
		initialization();
      loginPage = new LoginPage();
      loginPage.gotologin();
	 //homePage = new HomePage();//when we have a mthod that return object from Homepage class we have to initiolize it like this 
	 //(homePage=loginPage.performlogin();)
	
	}*/
	
	@BeforeMethod
	public void objects() throws IOException {
		initialization();
      loginPage = new LoginPageMethods();
      loginPage = new LoginPageMethods();
 	  homePage = new HomePageMethods();
 	  contactPage = new ContactPageMethods();
      loginPage.clickonlogin();
	 //homePage = new HomePage();//when we have a mthod that return object from Homepage class we have to initiolize it like this 
	 //(homePage=loginPage.performlogin();)
	
	}
	

	@Test(priority = 4)
	public void checkurl() {
		
		String expected="https://ui.freecrm.com/";
		String actual=loginPage.geturl();
		System.out.println(actual);
	    Assert.assertEquals(actual, expected,"the lable is not true");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	
	
	@Test(priority = 2)
	public void checktitle() {
		
		String expected="Cogmento CRM";
		String actual=loginPage.gettitle();
		System.out.println(actual);
	    Assert.assertEquals(actual, expected,"the lable is not true");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	
	/*@Test(priority = 3)
	public void checklogo() {
		
		boolean actual=loginPage.logoisdisplayed();
		System.out.println(actual);
	    Assert.assertTrue(actual,"the logo is not displayed");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}*/
	
	
	@Test(priority = 1)
	public void gotologinpage() throws IOException, InterruptedException  {
		
		
		Helper.email = "Layanzagha123@gmail.com";
		Helper.password = "Layandana1234";
		
		homePage=loginPage.login(Helper.email ,Helper.password );
       boolean isdisplayed=homePage.logoisdisplayed();
	   Assert.assertTrue(isdisplayed,"username or password was wrong");

		
	}
	
	/*@Test(priority = 4)
	public void login() throws InterruptedException, IOException {
		initialization();
		loginPage.performlogin();
      boolean isdisplayed=homePage.logoisdisplayed();
	   Assert.assertTrue(isdisplayed,"username or password was wrong");
		
	}*/
	
	@AfterMethod
	public void end(){
		teardown();
	}
	

}
