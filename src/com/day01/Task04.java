package com.day01;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		/*
		 * Question :
		 * Write a program that the number is perfectly divisible by 3 and 5 and then display Accepted else Rejected
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println(n+" is Accepted");
		}else {
			System.out.println(n+" is Rejected");
		}
		sc.close();
		
	}
}
