package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropdownTest5 extends LoginUtility {

	public static void main(String[] args) {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		quitBrowser();
	}

}
