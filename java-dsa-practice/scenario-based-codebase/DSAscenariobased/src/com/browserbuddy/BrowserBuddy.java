package com.browserbuddy;
import java.util.*;

public class BrowserBuddy {
	Stack <BrowserTab> closedTabs = new Stack<>();
	void closeTab(BrowserTab tab) {
		closedTabs.push(tab);
		System.out.println("Tab closed");
	}
	
	BrowserTab reopenTab() {
		if(!closedTabs.isEmpty()) {
			System.out.println("Tab reopened");
			return closedTabs.pop();
		}
		System.out.println("No closed tabs");
		return null;
	}
}
