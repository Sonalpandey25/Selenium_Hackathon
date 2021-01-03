package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class LeadsNewButton24 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		
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
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value=' New ']")));
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='lea3']")));
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Save '])[1]")));
		driver.findElement(By.xpath("(//input[@value=' Save '])[1]")).click();
		




	}

}
