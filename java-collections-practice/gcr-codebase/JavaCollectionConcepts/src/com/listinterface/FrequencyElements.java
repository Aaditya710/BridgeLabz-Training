package com.listinterface;

import java.util.*;
public class FrequencyElements {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of element: ");
		int size = input.nextInt();
		Map<String , Integer> map = new HashMap<>();
		for(int i = 0 ; i < size ; i++) {
			System.out.println("enter the number of fruit");
			String inputString = input.next();
			map.put(inputString, map.getOrDefault( inputString , 0)+1);
		}
		
		for(Map.Entry<String , Integer> hmap : map.entrySet()) {
			System.out.print(hmap.getKey() + " " + hmap.getValue() + " ");
		}
	}
}
