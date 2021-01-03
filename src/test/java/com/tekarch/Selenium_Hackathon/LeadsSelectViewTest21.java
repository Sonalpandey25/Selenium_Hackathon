package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class LeadsSelectViewTest21 extends LoginUtility {

	public static void main(String[] args) throws Exception{
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		leadsSelectView();
		// quitBrowser();
	}

	public static void leadsSelectView() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='fcf']")));
		driver.findElement(By.xpath("//select[@id='fcf']")).click();


	}

}
