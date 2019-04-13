package com.google.codejam.cryptopangrams;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = Integer.parseInt(sc.next());
		
		int N;
		int L;
		
		int arr[];
		
		int primes[];
		int asc[] = new int[26];
		
		for(int i = 0;i < T;i++) {
			
			sc.nextLine();
			N = Integer.parseInt(sc.next());
			L = Integer.parseInt(sc.next());
			
			arr = new int[L];
			
			sc.nextLine();
			for(int j = 0;j < L;j++) {
				arr[j] = Integer.parseInt(sc.next());							
			}
			
			primes = new int[L+1];
			asc = new int[26];
			
			for(int j=0;j < L-1;j++) {
				int gcd = getGCD(arr[j], arr[j+1]);
				
				if(j == 0)
					primes[0] = arr[0]/gcd;
				primes[j+1] = gcd;
				if(j == L-2)
					primes[L] = arr[L-1]/gcd;
			}
			
			/*for(int j = 0;j <= L;j++)
				System.out.println(primes[j]);*/
			int index = 0;
			
			for(int j = 0;j <= L;j++) {
				int flag = 0;
				for(int k = 0;k < j;k++) {
					if(primes[j] == primes[k]) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					asc[index] = primes[j];
					index++;
				}
			}
			
			String result = "";
			
			for(int j = 0;j <= L;j++) {
				int pos = 1;
				for(int k = 0;k < 26;k++) {
					if(primes[j] > asc[k])
						pos++;
				}
				result += (char)(64 + pos);
			}
			
			System.out.println("Case #" + (i+1) + ": " + result);
			
		}
		System.exit(0);
	}
	
	private static int getGCD(int a, int b) {		
		if (a == 0) 
	       return b; 
	    if (b == 0) 
	       return a; 		   
	    if (a == b) 
	        return a; 
	   
	    if (a > b) 
	        return getGCD(a-b, b); 
	    return getGCD(a, b-a); 
	}
	
}