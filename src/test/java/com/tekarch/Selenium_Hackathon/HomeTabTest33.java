package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class HomeTabTest33 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		NewPage();
		
	}

	public static void NewPage() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		waitExplicitly(10, driver.findElement(By.xpath("//span[contains(text(),'Sonal Pandey')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Sonal Pandey')]")).click();
		
	}

}
