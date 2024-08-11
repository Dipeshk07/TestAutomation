package com.automation.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	    public WebDriver driver;
	    ChromeOptions option=new ChromeOptions();
	    
	   public WebDriver launchBrowser() throws IOException
	    {   Properties prop=new Properties();
	     String path= System.getProperty("user.dir");
	      FileInputStream file=new FileInputStream(".\\src\\test\\java\\com\\automation\\demo\\test\\GlobalDataProperties.properties");
	      prop.load(file);
	      String browserName= prop.getProperty("browser");
	      if(browserName.equals("chrome"))
	      {    option.addArguments("--disable-notifications");
	    	   driver=new ChromeDriver(option);
	 		 
	      }
	      else if(browserName.equals("fireFox")) {
	    	   driver=new FirefoxDriver();
	  		 
	      }
	      driver.manage().window().maximize(); 
	      return driver;
	    }
	   public void takeScreenShot( String currentDate, WebDriver driver) throws IOException
	    {
	       File Source=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       String path= System.getProperty("user.dir");
	       File destination=new File(".\\Screenshot"+currentDate+".jpg");
	       FileUtils.copyFile(Source, destination);
	      
	    }
	 
}
