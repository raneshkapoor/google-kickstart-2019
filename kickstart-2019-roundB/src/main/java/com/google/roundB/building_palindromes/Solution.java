package com.google.roundB.building_palindromes;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int T = sc.nextInt();
		
		@SuppressWarnings("unused")
		int N;
		int Q;
		String str;
		int L;
		int R;
		
		int count = 0;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			Q = sc.nextInt();
			sc.nextLine();
			str = sc.nextLine();
			
			count = 0;
			
			for(int j = 0;j < Q;j++) {
				
				L = sc.nextInt();
				R = sc.nextInt();
				
				if(checkPalindrome(str, L, R))
					count++;
			}
			System.out.println("Case #" + (i+1) + ": " + count);			
		}
		
	}	
	
	private static boolean checkPalindrome(String str, int L, int R) {
		
		String subStr = str.substring(L-1, R);

		if(subStr.length() == 1)
			return true;
		if(subStr.length() == 2 && subStr.charAt(0) == subStr.charAt(1))
			return true;
		if(subStr.length() == 2 && subStr.charAt(0) != subStr.charAt(1))
			return false;
		
		int flag = 0;
		int count = 0;
		
		for(int i = 1;i < 27;i++) {
			
			char check = (char)(64+i);
			
			count = 0;
			
			for(int j = 0;j < subStr.length();j++) {
				if(subStr.charAt(j) == check)
					count++;
			}
			
			if(count % 2 == 1)
				flag++;
			if(flag == 2)
				return false;
			
		}
		
		return true;
	}
	
}