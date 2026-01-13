package com.browserbuddy;

public class Page {
	String url;
	Page prev;
	Page next;
	
	Page(String url){
		this.url = url;
	}
}
