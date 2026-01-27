package com.universityrecordsystem;

public class UniversityDigitalRecordSystem {
	public static void main(String [] args) {
		
		StudentBST bst = new StudentBST();
		
		bst.insert(50, "Amit");
		bst.insert(30, "Ravi");
		bst.insert(70, "Aditya");
		bst.insert(20, "Aviral");
		bst.insert(40, "Ayush");
		
		bst.displaySorted();
		System.out.println();
		
		bst.search(30);
		System.out.println("\n Deleting student with roll no. 30");
		bst.delete(30);
		
		bst.displaySorted();
	}

}
