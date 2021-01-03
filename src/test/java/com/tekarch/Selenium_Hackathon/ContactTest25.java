package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class ContactTest25 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		newContact();
		quitBrowser();
	}

	public static void newContact() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value=' New ']")));
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Pandey");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='con4']")));
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("ABC");
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Save '])[1]")));
		driver.findElement(By.xpath("(//input[@value=' Save '])[1]")).click();

	}

}
