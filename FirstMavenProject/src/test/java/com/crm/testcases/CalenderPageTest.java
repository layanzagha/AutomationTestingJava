/*package com.crm.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.base.Base;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class CalenderPageTest extends Base{

	public CalenderPageTest() throws IOException {
		super();
		
	}
	LoginPage loginPage;
	HomePage homePage;

		@BeforeMethod
		public void objects() throws IOException, InterruptedException {
			initialization();
	        loginPage = new LoginPage();
			loginPage.gotologin();
			homePage.clickoncontant();
	
		
		}
		
	

	@Test
	public void fillthecalender() throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement mainnav = driver.findElement(By.id("main-nav"));
		action.moveToElement(mainnav).build().perform();
		WebElement calender =driver.findElement(By.xpath("//span[contains(text(),'Calendar')]"));
		calender.click();
		SoftAssert softassert = new SoftAssert();
		WebElement cell= driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		Thread.sleep(4000);
		
		cell.click();
		
		WebElement title1= driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
		boolean actual=title1.isDisplayed();
		System.out.println(actual);
		softassert.assertTrue(actual,"title is not appeared");
		
		WebElement title= driver.findElement(By.name("title"));
		title.sendKeys("doctor appointment");
		WebElement startdate= driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		startdate.click();
		
		WebElement num= driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]"));
		num.click();
		
		
		
		boolean actual=title.isDisplayed();
		boolean expected=true;
		System.out.println(actual);
	    Assert.assertEquals(actual, expected,"the lable is not true");
		//or Assert.assertTrue(actual,"the lable is not true");
		
	}
	
	@AfterMethod
	public void end(){
		teardown();
	}

}
*/