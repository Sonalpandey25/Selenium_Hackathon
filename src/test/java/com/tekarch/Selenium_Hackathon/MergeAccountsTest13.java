package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class MergeAccountsTest13 extends LoginUtility {
	
	public static void main(String[] args) throws Exception {

		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		editView();
		quitBrowser();
	}
	public static void editView() throws Exception {
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(10000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='srch']")));
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("ABC");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value='Find Accounts']")));
		driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Next '])[2]")));
		driver.findElement(By.xpath("(//input[@value=' Next '])[2]")).click();
		waitExplicitly(10, driver.findElement(By.xpath("(//input[@value=' Merge '])[2]")));
		driver.findElement(By.xpath("(//input[@value=' Merge '])[2]")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(500);
	}

}
