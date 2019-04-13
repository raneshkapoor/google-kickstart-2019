package com.google.roundA.parcels;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		int R;
		int C;
		String arr[];
		
		for(int i = 0;i < T;i++) {
			
			R = sc.nextInt();
			C = sc.nextInt();
			sc.nextLine();
			
			arr = new String[R];
			
			for(int j = 0;j < R;j++) {
				arr[j] = sc.nextLine();
			}
			
			for(int j = 0;j < R;j++) {
				for(int k = 0;k < arr[j].length();k++) {	
					if(arr[j].charAt(k) == '0') {
						
						//TODO
						getDeliveryTimes(arr, j, k);
						
					}					
				}				
			}
			
		}
	}
	
	private static int getDeliveryTimes(String arr[], int R, int C) {
		
		
		String str = arr[R].substring(0, C) + "1" + arr[R].substring(C+1, arr[R].length());
		
		arr[R] = str;
		
		return 0;
	}

	private static int calculateDeliveryTime(String arr[]) {
		
		int time = 0;
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length();j++) {
				
				if(arr[i].charAt(j) == '0') {
					
				}	
			}
		}
		
		return 0;
	}
	
	private static int calculateDistance(String arr[], int R, int C) {
		
		return 0;
		
	}
	
}
