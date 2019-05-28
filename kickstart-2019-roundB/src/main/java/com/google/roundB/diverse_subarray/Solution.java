package com.google.roundB.diverse_subarray;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		int N;
		int S;
		int arr[];
		
		int maxCount = 0;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			S = sc.nextInt();
			arr = new int[N];
			
			for(int j = 0;j < N;j++)
				arr[j] = sc.nextInt();
			
			maxCount = 0;
			
			for(int j = 0;j < N-1;j++) {
				for(int k = N-1;k > j;k--) {
					
					if((k-j+1) > maxCount) {
						int temp = getMax(arr, j, k, S);
						if(temp > maxCount)
							maxCount = temp;
					}
					
				}
			}
			System.out.println("Case #" + (i+1) + ": " + maxCount);
		}
		
	}
	
	private static int getMax(int arr[], int L, int R, int S) {		
		int count = 0;
		
		for(int i = L;i <= R;i++) {
			int flag = 0;
			for(int j = L;j < i;j++) {
				if(arr[i] == arr[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				continue;
			}
			int occ = 0;
			for(int j = L;j <= R;j++) {
				if(arr[i] == arr[j]) {
					occ++;
				}
				if(occ > S)
					break;
			}
			if(occ <= S)
				count += occ;
		}
		return count;
	}
	
}