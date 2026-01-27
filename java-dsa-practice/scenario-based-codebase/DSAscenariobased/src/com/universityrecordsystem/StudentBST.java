package com.universityrecordsystem;

public class StudentBST {
	
	Node root;
	void insert(int rollNo, String name) {
		root = insertRec(root, rollNo, name);
	}
	
	Node insertRec(Node root, int rollNo, String name) {
		if(root == null) {
			return new Node(rollNo, name);
		}
		
		if(rollNo < root.rollNo) {
			root.left = insertRec(root.left, rollNo, name);
		}
		else if(rollNo > root.rollNo) {
			root.right = insertRec(root.right, rollNo, name);
		}
		
		return root;
	}
	
	void search(int rollNo) {
		Node result = searchRec(root, rollNo);
		
		if(result == null) {
			System.out.println("Student with roll number " + rollNo + " is not found");
		}
		else {
			System.out.println("Roll no. " + result.rollNo + "\n Name : " + result.name);
		}
	}
	
	Node searchRec(Node root, int rollNo) {
		if(root == null || root.rollNo == rollNo) 
			return root;
		
		if(rollNo < root.rollNo) 
			return searchRec(root.left, rollNo);
		
		return searchRec(root.right, rollNo);
		
	}
	
	void displaySorted() {
		System.out.println("Sorted Students Record: ");
		inorder(root);
	}
	
	void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.rollNo + " - " + root.name);
			inorder(root.right);
		}
	}
	
	void delete(int rollNo) {
		root = deleteRec(root, rollNo);
	}
	
	Node deleteRec(Node root, int rollNo) {
		if(root == null)
			return root;
		
		if(rollNo < root.rollNo) {
			root.left = deleteRec(root.left, rollNo);
		}
		else if(rollNo > root.rollNo) {
			root.right = deleteRec(root.right, rollNo);
		}
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.rollNo = minValue(root.right);
			root.right = deleteRec(root.right, root.rollNo);
		}
		return root;
	}
	
	int minValue(Node root) {
		int min = root.rollNo;
		while(root.left != null) {
			min = root.left.rollNo;
			root = root.left;
		}
		return min;
	}
}
