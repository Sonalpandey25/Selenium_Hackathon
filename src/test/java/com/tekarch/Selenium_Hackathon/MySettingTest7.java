package com.tekarch.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MySettingTest7 extends LoginUtility {

	public static void main(String[] args) throws Exception {

		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		//Mysetting();
		//displayandLayout();
		//email();
		Calender();
		quitBrowser();
	}
	public static void Calender() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='My Settings']")));
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//div[@id='CalendarAndReminders']")));
		driver.findElement(By.xpath("//div[@id='CalendarAndReminders']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='Reminders_font']")));
		driver.findElement(By.xpath("//a[@id='Reminders_font']")).click();
		driver.findElement(By.xpath("//input[@value='Open a Test Reminder']")).click();
		Thread.sleep(1000);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsTabs.get(1));
		Thread.sleep(500);
		driver.close();
		
	}
	public static void email() throws Exception {
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='My Settings']")));
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//span[@id='EmailSetup_font']")));
		driver.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='EmailSettings_font']")));
		driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
		WebElement ename = driver.findElement(By.xpath("//input[@id='sender_name']"));
		ename.clear();
		Thread.sleep(500);
		ename.sendKeys("Sonal");
		WebElement email = driver.findElement(By.xpath("//input[@id='sender_email']"));
		email.clear();
		Thread.sleep(500);
		email.sendKeys("pandeysonal25@gmail.com");
		WebElement radio = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		radio.isSelected();
		radio.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		
	}

	public static void Mysetting() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='My Settings']")));
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//span[@id='LoginHistory_font']")));
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=0054x000002Loon']")));
		driver.findElement(By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=0054x000002Loon']")).click();
		
	}
	public static void displayandLayout() throws Exception{
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='My Settings']")));
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		Thread.sleep(1000);
		waitExplicitly(10, driver.findElement(By.xpath("//div[@id='DisplayAndLayout']")));
		driver.findElement(By.xpath("//div[@id='DisplayAndLayout']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
		driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
		
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='p4']")));
		driver.findElement(By.xpath("//select[@id='p4']")).sendKeys("Salesforce Chatter");
		waitExplicitly(10, driver.findElement(By.xpath("//select[@id='duel_select_0']")));
		WebElement select = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		select.sendKeys("Reports");
		driver.findElement(By.xpath("//a[@id='duel_select_0_right']")).click();

	}

}
