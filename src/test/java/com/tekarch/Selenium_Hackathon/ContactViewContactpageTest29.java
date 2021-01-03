package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class ContactViewContactpageTest29 extends LoginUtility {

	public static void main(String[] args) throws Exception {

		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		contactView();
		 quitBrowser(); 
	}

	public static void contactView() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Pandey')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Pandey')]")).click();
		Thread.sleep(500);

	}

}
