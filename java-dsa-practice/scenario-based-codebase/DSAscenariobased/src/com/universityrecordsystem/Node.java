package com.universityrecordsystem;

public class Node {
	int rollNo;
	String name;
	Node left, right;
	
	Node(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		left = right = null;
	}

}
