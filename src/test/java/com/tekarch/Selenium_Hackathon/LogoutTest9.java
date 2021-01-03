package com.tekarch.Selenium_Hackathon;

public class LogoutTest9 extends LoginUtility {

	public static void main(String[] args) throws Exception {
		launchbrowser();
		gotoSalesforce();
		loginSalesforce();
		logoutSalesforce();
		quitBrowser();

	}

}
