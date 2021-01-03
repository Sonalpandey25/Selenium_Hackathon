package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class OptyQuaterlySummaryReportTest19 extends LoginUtility{

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		summaryReports();
		// quitBrowser();
	}

	public static void summaryReports() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		// Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='quarter_q']")));
		driver.findElement(By.xpath("//select[@id='quarter_q']")).sendKeys("Next FQ");
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='open']")));
		driver.findElement(By.xpath("//select[@id='open']")).sendKeys("Closed Opportunities");


	}


}
