package com.google.codejam.robot_programming_strategy;

import java.util.Scanner;

public class Solution {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		int A;
		String arr[];
		
		String result;
		
		for(int i = 0;i < T;i++) {
			
			A = sc.nextInt();
			arr = new String[A];
			
			sc.nextLine();
			for(int j = 0;j < A;j++) {
				arr[j] = sc.nextLine();				
			}
			
			result = getWinnerMove(arr[0].charAt(0));
			
			if(A == 3) {
				
				int winnerIndex;
				
				if(arr[1].equalsIgnoreCase(arr[2])) {
					winnerIndex = 1;
				} else {
					if(fetchWinner(arr[1], arr[2])) {
						winnerIndex = 1;
					} else {
						winnerIndex = 2;
					}
				}
				
				if(checkCombination(arr[winnerIndex].charAt(0), result.charAt(0)).equalsIgnoreCase("A")) {
					result = "IMPOSSIBLE";
				} else if(checkCombination(arr[winnerIndex].charAt(0), result.charAt(0)).equalsIgnoreCase("T")) {
					result += getWinnerMove(arr[winnerIndex].charAt((1 % arr[winnerIndex].length())));
				}
				
			} else if(A == 7) {
				
				int winnerIndex;
				
				if(arr[1].equalsIgnoreCase(arr[2])) {
					winnerIndex = 1;
				} else {
					if(fetchWinner(arr[1], arr[2])) {
						winnerIndex = 1;
					} else {
						winnerIndex = 2;
					}
				}
				
				if(checkCombination(arr[winnerIndex].charAt(0), result.charAt(0)).equalsIgnoreCase("A")) {
					result = "IMPOSSIBLE";
				} else if(checkCombination(arr[winnerIndex].charAt(0), result.charAt(0)).equalsIgnoreCase("T")) {
					result += getWinnerMove(arr[winnerIndex].charAt((1 % arr[winnerIndex].length())));
					
					
					
					int winnerIndex1;
					
					if(arr[3].equalsIgnoreCase(arr[4])) {
						winnerIndex1 = 3;
					} else {
						if(fetchWinner(arr[3], arr[4])) {
							winnerIndex1 = 3;
						} else {
							winnerIndex1 = 4;
						}
					}
					
					int winnerIndex2;
					
					if(arr[5].equalsIgnoreCase(arr[6])) {
						winnerIndex2 = 5;
					} else {
						if(fetchWinner(arr[5], arr[6])) {
							winnerIndex2 = 5;
						} else {
							winnerIndex2 = 6;
						}
					}
					
					
					int winnerIndex3;
					
					if(arr[winnerIndex1].equalsIgnoreCase(arr[winnerIndex2])) {
						winnerIndex3 = winnerIndex1;
					} else {
						if(fetchWinner(arr[winnerIndex1], arr[winnerIndex2])) {
							winnerIndex3 = winnerIndex1;
						} else {
							winnerIndex3 = winnerIndex2;
						}
					}
					
					if(arr[winnerIndex3].equalsIgnoreCase(result)) {
						result = "IMPOSSIBLE";
					} else if(checkCombination(arr[winnerIndex3].charAt(0), result.charAt(0)).equalsIgnoreCase("T")) {
						result += getWinnerMove(arr[winnerIndex3].charAt((1 % arr[winnerIndex3].length())));
					}
				}
			
			}
		
			//System.out.println(result);
			//TODO sysout result
			
			System.out.println("Case #" + (i+1) + ": " + result);
			
		}
		
	}
	
	private static boolean fetchWinner(String A, String B) {
		
		int index = -1;
		
		while(true) {
			index++;
			
			char a = A.charAt((index % A.length()));
			char b = B.charAt((index % B.length()));
			
			if(checkCombination(a, b).equalsIgnoreCase("A")) {
				return true;
			} else if(checkCombination(a, b).equalsIgnoreCase("B")) {
				return false;
			} 
		}
	}

	private static String checkCombination(char A, char B) {
		String result = "";
		if(A == 'R') {
			if(B == 'R') {
				result = "T";
			} else if(B == 'P') {
				result = "B";
			} else {
				result = "A";
			}
		} else if(A == 'P') {
			if(B == 'R') {
				result = "A";
			} else if(B == 'P') {
				result = "T";
			} else {
				result = "B";
			}
		} else {
			if(B == 'R') {
				result = "B";
			} else if(B == 'P') {
				result = "A";
			} else {
				result = "T";
			}
		}
		return result;
	}
	
	private static String getWinnerMove(char A) {
		String result = "";
		if(A == 'R') {
			result = "P";
		} else if(A == 'P') {
			result = "S";
		} else if(A == 'S') {
			result = "R";
		}
		return result;
	}
	
}
