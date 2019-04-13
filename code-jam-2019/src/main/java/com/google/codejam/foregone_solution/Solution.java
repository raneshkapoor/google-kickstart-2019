package com.google.codejam.foregone_solution;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		String str = "";
		sc.nextLine();
		
		for(int i = 0;i < T;i++) {
			
			str = sc.nextLine();
			
			String sol1 = "";
			String sol2 = "";
			
			for(int j = 0;j < str.length();j++) {	
				if(str.charAt(j) == '7') {
					sol1 += "5";
					sol2 += "2";
				} else if(str.charAt(j) == '8') {
					sol1 += "5";
					sol2 += "3";
				} else if(str.charAt(j) == '9') {
					sol1 += "6";
					sol2 += "3";
				} else {
					sol1 += "" + Integer.parseInt("" + str.charAt(j))/2;					
					if(Integer.parseInt("" + str.charAt(j)) % 2 == 1) {
						sol2 += "" + (Integer.parseInt("" + str.charAt(j))/2 + 1);
					} else {
						sol2 += "" + Integer.parseInt("" + str.charAt(j))/2;
					}
				}
			}
			
		//	System.out.println(sol1);
		//	System.out.println(sol2);
			
			System.out.println("Case #" + (i+1) + ": " + sol1 + " " + sol2);
			
		}
		System.exit(0);
	}
}