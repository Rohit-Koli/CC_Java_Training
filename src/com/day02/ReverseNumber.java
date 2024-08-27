package com.day02;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int digit=sc.nextInt();
		int rev=0;
		while(digit>0) {
			rev=rev*10+(digit%10);
			digit/=10;
		}
		System.out.println(rev);
		sc.close();
	}
}
