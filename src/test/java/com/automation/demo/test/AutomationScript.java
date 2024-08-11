package com.automation.demo.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AutomationScript extends BaseClass {
     
	   public WebDriver driver;
	 
	 @Test
	 public void getScreenShot() throws Exception {
	
		 driver=launchBrowser();
		 MyScreenRecorder.startRecording("getScreenShot()");
		 driver.get("https://www.getcalley.com/page-sitemap.xml");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 List<WebElement> elements=driver.findElements(By.xpath("//tbody//a"));
		 for(int i=0;i<5;i++)
		 {    String currentDate=new Date().toString().replace(" ", "-").replace(":", "-");
			  elements.get(i).click();
			 Thread.sleep(5000);
			 Thread.sleep(2000);
			 takeScreenShot( currentDate,driver);
			 driver.navigate().back(); 
			 elements=driver.findElements(By.xpath("//tbody//a"));
			 Thread.sleep(2000);
		 }
		 MyScreenRecorder.stopRecording();
		 driver.close();
		
	 }

}
