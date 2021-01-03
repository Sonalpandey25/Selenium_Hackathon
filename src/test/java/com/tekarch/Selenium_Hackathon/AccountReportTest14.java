package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountReportTest14 extends LoginUtility {

	public static void main(String[] args) throws Exception {

		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		report();
		quitBrowser();
	}
	
	public static void report() throws Exception {
		
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		waitExplicitly(10, driver.findElement(By.id("ext-gen20")));
		WebElement date = driver.findElement(By.id("ext-gen20"));
		date.sendKeys("Created Date");
		Thread.sleep(2000);
		waitExplicitly(10, driver.findElement(By.xpath("//img[@id='ext-gen152']")));
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();		
		waitExplicitly(10, driver.findElement(By.xpath("//button[contains(text(),'Today')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//button[@id='ext-gen49']")));
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("CS");
		driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).sendKeys("");
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")).click();
				
	}

}
