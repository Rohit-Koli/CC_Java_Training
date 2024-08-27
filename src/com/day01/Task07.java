package com.day01;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		if(num==0) {
			System.out.println("Number is Zero");
		}else if(num%2==0) {
			System.out.println("Number is Even");
		}else if(num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Odd");
		}
		sc.close();
	}
}
