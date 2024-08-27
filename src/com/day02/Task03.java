package com.day02;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Starting point");
		int start=sc.nextInt();
		System.out.println("Enter Ending point");
		int end=sc.nextInt();
		if(start<end) {
			for(int i=start;i<=end;i++) {
				System.out.print(i+" ");
			}
		}else {
			for(int i=start;i>=end;i--) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
