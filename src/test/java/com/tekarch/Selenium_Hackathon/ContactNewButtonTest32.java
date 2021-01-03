package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class ContactNewButtonTest32 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		NewPage();
		//quitBrowser();
	}

	public static void NewPage() throws Exception {

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
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='con4']")));
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value='Save & New'])[1]")));
		driver.findElement(By.xpath("(//input[@value='Save & New'])[1]")).click();
		Thread.sleep(1000);


	}

}
