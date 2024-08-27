package com.day01;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num 01");		
		int n1=sc.nextInt();
		
		System.out.println("Enter Num 02");		
		int n2=sc.nextInt();
		
		System.out.println("Enter Num 03");		
		int n3=sc.nextInt();
		
//		int max=0;
		if(n1>n2 && n1>n3) {
			System.out.println("Num 01 is greater");
		}else if(n2>n1 && n2>n3) {
			System.out.println("Num 02 is greater");
		}else {
			System.out.println("Num 03 is greater");
		}
		sc.close();
	}
}
