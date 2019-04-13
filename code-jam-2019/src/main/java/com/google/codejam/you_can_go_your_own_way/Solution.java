package com.google.codejam.you_can_go_your_own_way;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		sc.nextLine();
		
		int N;
		String str = "";
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			sc.nextLine();
			str = sc.nextLine();
			
			String result = "";
			
			for(int j = 0;j < str.length();j++) {
				
				if(str.charAt(j) == 'E') {
					result += "S";
				} else {
					result += "E";
				}
				
			}
			
			System.out.println("Case #" + (i+1) + ": " + result);
			
		}
		System.exit(0);
	}
}