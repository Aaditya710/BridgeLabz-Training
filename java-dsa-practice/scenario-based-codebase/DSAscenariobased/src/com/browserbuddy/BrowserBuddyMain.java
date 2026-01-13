package com.browserbuddy;

public class BrowserBuddyMain {
	public static void main(String [] args) {
		BrowserTab tab = new BrowserTab();
		
		tab.visit("google.com");
		tab.visit("openai.com");
		tab.visit("github.com");
		
		tab.back();
		tab.back();
		tab.forward();
		
		BrowserBuddy browser = new BrowserBuddy();
		browser.closeTab(tab);
		
		BrowserTab restoredTab = browser.reopenTab();
		System.out.println("Current Page: " + restoredTab.getCurrentPage());
		
	}

}
