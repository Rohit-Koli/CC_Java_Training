package com.day02;

import java.util.Scanner;

public class PalindormeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int digit=sc.nextInt();
		int digit=sc.nextInt();
		int og=digit;
		int rev=0;
		while(digit>0) {
			rev=rev*10+(digit%10);
			digit/=10;
		}
		if(rev==og) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
		sc.close();
	}
}
