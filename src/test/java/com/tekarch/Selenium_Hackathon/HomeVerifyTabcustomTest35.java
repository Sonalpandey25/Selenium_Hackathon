package com.tekarch.Selenium_Hackathon;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class HomeVerifyTabcustomTest35 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		customTab();

	}

	public static void customTab() throws Exception {

		waitExplicitly(10, driver.findElement(By.xpath("//a[@href='/home/showAllTabs.jsp']")));
		driver.findElement(By.xpath("//a[@href='/home/showAllTabs.jsp']")).click();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value='Customize My Tabs']")));
		driver.findElement(By.xpath("//input[@value='Customize My Tabs']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//option[@value='Chatter']")));
		driver.findElement(By.xpath("//option[@value='Chatter']")).click();
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='duel_select_0_left']")));
		driver.findElement(By.xpath("//a[@id='duel_select_0_left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		logoutSalesforce();
		gotoSalesforce();
		loginSalesforce();

	}

}
