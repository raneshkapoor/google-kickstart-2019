package com.google.practice.number_guessing;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		int A;
		int B;
		int N;
		
		String str = "";
		
		for(int i = 0;i < T;i++) {
			
			A = sc.nextInt() + 1;
			B = sc.nextInt() + 1;
			N = sc.nextInt();
			sc.nextLine();
			
			str = "";
			
			do {
				
				if(str.equalsIgnoreCase("TOO_SMALL"))
					A = (A + B)/2;
				if(str.equalsIgnoreCase("TOO_BIG"))
					B = (A + B)/2;
				
				System.out.println((A + B)/2);
				N--;
				str = sc.nextLine();				
				
				if(str.equalsIgnoreCase("WRONG_ANSWER"))
					System.exit(0);
				
			} while(!(str.equalsIgnoreCase("CORRECT")) && N > 0);
			
		}
		
		System.exit(0);
		
	}
}