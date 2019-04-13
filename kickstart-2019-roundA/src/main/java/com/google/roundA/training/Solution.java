package com.google.roundA.training;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		int N;
		int P;
		int arr[];		
		
		int hours = -1;
		int temp;
		
		for(int i = 0;i < T;i++) {
			hours = -1;			
			
			N = sc.nextInt();
			P = sc.nextInt();
			arr = new int[N];
			
			for(int j = 0;j < N;j++) {
				arr[j] = sc.nextInt();
			}
			
			sort(arr, 0, N-1);
			
			for(int j = 0;j <= N-P;j++) {
				temp = getTrainingHours(arr, j, j+P);
			//	System.out.println("temp : " + temp);
				if(hours == -1 || temp < hours) {
					hours = temp;
				}				
			}
			
			System.out.println("Case #" + (i+1) + ": " + hours);
			
		}
		
	}
	
	private static int getTrainingHours(int arr[], int min, int max) {
		int hours = 0;		
		int maxx = -1;
		
		for(int i = min;i < max;i++)
			if(maxx == -1 || arr[i] > maxx)
				maxx = arr[i];
			
		for(int i = min;i < max;i++) {
			hours += (maxx - arr[i]);
		}		
		return hours;
	}
	
	static void sort(int arr[], int low, int high) { 
        if (low < high) { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

	static int partition(int arr[], int low, int high) { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) { 
            if (arr[j] <= pivot) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
	
}
