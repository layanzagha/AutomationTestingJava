package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.crm.utils.WebListener;

//import com.crm.utils.WebListener;

  public class Base {
    public static WebDriver driver;
    public static Properties prop ;
    public static EventFiringWebDriver e_driver ;//for listener
    public static WebListener weblistener;
    

    public Base() throws IOException{
    	prop=new Properties();	
    	FileInputStream fis = new FileInputStream("C:\\Users\\LayanZ\\eclipse-workspace\\TrainingProjectNewFramework\\src\\com\\crm\\configration\\config.properties");
        prop.load(fis);
    	
    }
    
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LayanZ\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		e_driver = new EventFiringWebDriver(driver);
		weblistener = new WebListener();
		e_driver.register(weblistener);
		driver=e_driver;
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
}
	
	
	public void homepageinitialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LayanZ\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		e_driver = new EventFiringWebDriver(driver);
		weblistener = new WebListener();
		e_driver.register(weblistener);
		driver=e_driver;
		
		driver.get(prop.getProperty("URL2"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
}
	
	public void teardown(){
		driver.quit();
	}
	


}
