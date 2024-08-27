package com.start_patter;

public class Pattern03 {
	/*
1 1 1 1 
0 0 0 0 
1 1 1 1 
0 0 0 0 
	 */
	public static void main(String[] args) {
//		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
}
