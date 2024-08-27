package com.day02;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("You Have Entered Num 1 ");
			break;
		case 2:
			System.out.println("You Have Entered Num 2 ");
			break;
		default:
			System.out.println("You Have Entered "+n);
			break;
		}
		sc.close();
	}
}
