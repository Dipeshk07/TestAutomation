package com.automation.demo.script2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void uploadFile() throws AWTException{
		String path= System.getProperty("user.dir");
		 Robot RB=new Robot();
		 StringSelection sc=new StringSelection(path+"\\demo-data.xlsx");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		     RB.delay(1000);
		       RB.keyPress(KeyEvent.VK_CONTROL);
		       RB.keyPress(KeyEvent.VK_C);
		       RB.delay(1000);
		       RB.keyRelease(KeyEvent.VK_CONTROL);
		       RB.keyRelease(KeyEvent.VK_C);
		       RB.delay(1000);
		       RB.keyPress(KeyEvent.VK_CONTROL);
		       RB.keyPress(KeyEvent.VK_V);
		       RB.delay(1000);
		       RB.keyRelease(KeyEvent.VK_CONTROL);
		       RB.keyRelease(KeyEvent.VK_V);
		       RB.delay(1000);
		       RB.keyPress(KeyEvent.VK_ENTER);
		       RB.keyRelease(KeyEvent.VK_ENTER);
		       

	}

}
