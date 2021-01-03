package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class OptyPipelineReportTest17 extends LoginUtility{

	public static void main(String[] args) throws Exception{
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		pipeLine();
		//quitBrowser();
	}

	public static void pipeLine() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();

	}

}
