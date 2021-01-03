package com.tekarch.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyprofileTest6 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		WebElement ele = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		waitExplicitly(10, ele);
		ele.click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='My Profile']")));
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		Thread.sleep(1000);
	/*	waitExplicitly(10, driver.findElement(By.xpath("//a[@title='User Action Menu']")));
		driver.findElement(By.xpath("//a[@title='User Action Menu']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Edit Profile']")));
		driver.findElement(By.xpath("//a[@title='Edit Profile']")).click(); */
		//***************************Iframe****************
	/*	driver.switchTo().frame(driver.findElement(By.id("aboutMeContentId")));
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		waitExplicitly(10, lname);	
		lname.sendKeys("P");
		waitExplicitly(10, driver.findElement(By.xpath("//input[@value='Save All']")));
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();	  */
		//***********************************************Post*********
	/*   waitExplicitly(10, driver.findElement(By.xpath("//a[@title='Post']")));
		driver.findElement(By.xpath("//a[@title='Post']")).click();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		//WebElement post = driver.findElement(By.xpath("//input[@id='richTextPlaceholderInput']"));
	    //driver.switchTo().frame(driver.findElement(By.xpath("")("mce_0_ifr")));*/
		//***************************FileUpload*****************
	/*	waitExplicitly(10, driver.findElement(By.xpath("//a[@title='File']"))); 
		driver.findElement(By.xpath("//a[@title='File']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"))); 
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		WebElement file = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		file.sendKeys("C:\\Users\\LENOVO\\Pictures\\Flower1.jpg");  */
		//********************************Upload Photo**********
		Thread.sleep(500);
		waitExplicitly(10, driver.findElement(By.xpath(".*//a[@id='uploadLink']"))); 
		driver.findElement(By.xpath(".*//a[@id='uploadLink']")).click();
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		WebElement brousephoto = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		brousephoto.sendKeys("C:\\Users\\LENOVO\\Pictures\\surf.jpg");
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save']")).click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 100,20);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		driver.switchTo().defaultContent();

	}

}
