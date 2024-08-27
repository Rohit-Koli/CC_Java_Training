package com.day02;

public class Task02 {
	public static void main(String[] args) {
//		oddSeries();
//		System.out.println("\n*");
//		evenSeries();
//		ser3();
		System.out.println();
		ser5();
	}
	
	public static void oddSeries() {
		int i=1;
		while(i<=13) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public static void evenSeries() {
		int i=1;
		while(i<=13) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public static void ser3() {
		int start=4;
		while(start<=16) {
			System.out.print(start+" ");
			System.out.print(start-1+" ");
			start+=4;
		}
	}
	
	public static void ser4() {
		int start=1;
		while(start<=13) {
			System.out.print(start+" ");
			System.out.print(start+1+" ");
			start+=4;
		}
	}
	
	public static void ser5() {
		int start=5;
		while(start<=11) {
			System.out.print(start+" ");
			System.out.print((start-3)+" ");
			start+=2;
		}
	}
}
