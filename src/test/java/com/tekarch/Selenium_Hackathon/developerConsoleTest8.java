package com.tekarch.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class developerConsoleTest8 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		openconsole();
		quitBrowser();

	}
	public static void openconsole() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")));
		driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).click();
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsTabs.get(1));
		Thread.sleep(500);
		driver.close();
		
	}

}
