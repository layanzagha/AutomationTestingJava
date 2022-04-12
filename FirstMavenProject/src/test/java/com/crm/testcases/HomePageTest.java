package com.crm.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.base.Base;
import com.crm.pages.elements.ContactPageObjects;
import com.crm.pages.elements.HomePageObjects;
import com.crm.pages.elements.LoginPageObjects;
import com.crm.pages.methods.ContactPageMethods;
import com.crm.pages.methods.HomePageMethods;
import com.crm.pages.methods.LoginPageMethods;



//I need to login
public class HomePageTest extends Base {
	
	
	public HomePageTest() throws IOException {
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
	 homePage= new HomePageMethods() ;
	 contactPage= new ContactPageMethods() ;
	 Helper.email = "Layanzagha123@gmail.com";
     Helper.password = "Layandana1234";
     
	// homePage = new HomePage();
	// contactPage = new ContactPage();
	loginPage.performlogin(Helper.email,Helper.password);
	 
	}
	
	
	@Test
	public void checkurl() {
		
		String expected="https://ui.freecrm.com/";
		String actual=homePage.geturl();
		System.out.println(actual);
	    Assert.assertEquals(actual, expected,"the lable is not true");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	
	@Test
	public void checktitle() {
		
		String expected="Cogmento CRM";
		String actual=homePage.gettitle();
		System.out.println(actual);
	    Assert.assertEquals(actual, expected,"the lable is not true");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	@Test
	public void checklogo() {
        Boolean actual=homePage.checklogo();
		System.out.println(actual);
	    Assert.assertTrue(actual,"you are not at the home page");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	

	@Test
	public void clickoncontact() throws IOException, InterruptedException {
		
        homePage.clickoncontant();
		boolean actual=contactPage.gettoptitle();
		System.out.println(actual);
	    Assert.assertTrue(actual,"you are not at the contact page");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	} 


	@AfterMethod
	public void end(){
		teardown();
	}
	
	

}
