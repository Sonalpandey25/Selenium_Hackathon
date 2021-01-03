package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class ContactErrorMessageTest30 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		contactErrorMessage();
		 quitBrowser();
	}

	public static void contactErrorMessage() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000); 
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Save '])[1]")));
		driver.findElement(By.xpath("(//input[@value=' Save '])[1]")).click();


	}

}
