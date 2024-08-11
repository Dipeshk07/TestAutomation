package com.automation.demo.script2;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.demo.test.BaseClass;
import com.automation.demo.test.MyScreenRecorder;

public class FunctionDemoTest extends BaseClass {
	public WebDriver driver;
	@Test
   public void testFunctionality() throws Exception
   {
		driver=launchBrowser();
		
		 MyScreenRecorder.startRecording("testFunctionality()");
		 driver.get("https://demo.dealsdray.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
         driver.findElement(By.xpath("//button[text()='Login']")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//button//span[text()='Order']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button//span[text()='Orders']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl')]")).click();
         Thread.sleep(2000);
         fileUpload.uploadFile();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[text()='Import']")).click(); 
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Thread.sleep(2000);
         WebElement element =driver.findElement(By.xpath("//button[text()='Previous']"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true)", element);
         Thread.sleep(2000);
         String currentDate=new Date().toString().replace(" ", "-").replace(":", "-");
         takeScreenShot(currentDate,driver);
         
   }
}
