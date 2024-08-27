package com.day02;

import java.util.Scanner;

public class NUmberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long digit=sc.nextLong();
		int count=0;
		while(digit>0) {
			count++;
			digit/=10;
		}
		System.out.println("Number of digits is :"+count);
		sc.close();
	}
}
