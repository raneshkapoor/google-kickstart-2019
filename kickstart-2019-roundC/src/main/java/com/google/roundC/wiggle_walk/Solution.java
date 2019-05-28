package com.google.roundC.wiggle_walk;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		int N;
		int R;
		int C;
		int SR;
		int SC;
		
		String moves = "";
		
		int arr[][];
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			R = sc.nextInt();
			C = sc.nextInt();
			SR = sc.nextInt() - 1;
			SC = sc.nextInt() - 1;
			
			sc.nextLine();
			
			moves = sc.nextLine();
			
			arr = new int[R][C];
			
			for(int j = 0;j < R;j++)
				for(int k = 0;k < C;k++)
					arr[j][k] = 0;
			
			arr[SR][SC] = 1;
			
			
			for(int j = 0;j < moves.length();j++) {
				
				switch(moves.charAt(j)) {
				
				case 'N':
					while(arr[SR - 1][SC] == 1) {
						SR--;
					}
					SR--;
					break;
				case 'E':
					while(arr[SR][SC + 1] == 1) {
						SC++;
					}
					SC++;
					break;
				case 'W':
					while(arr[SR][SC - 1] == 1) {
						SC--;
					}
					SC--;
					break;
				case 'S':
					while(arr[SR + 1][SC] == 1) {
						SR++;
					}
					SR++;
					break;
				}
				
				arr[SR][SC] = 1;
				
			}
			
			System.out.println("Case #" + (i + 1) + ": " + (SR + 1) + " " + (SC + 1));			
			
		}
		
	}

}
