package com.start_patter;

public class Pattern02 {
	/*
	 * 11 12 13 
       21 22 23 
	   31 32 33 
	 */
	public static void main(String[] args) {
		sol02();
	}
	public static void sol01() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}
	public static void sol02() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print((i*10+j)+" ");
			}
			System.out.println();
		}
	}
}
