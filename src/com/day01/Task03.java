package com.day01;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
//		Calculate %
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Marks ");
		double total_marks=sc.nextDouble();
		System.out.println("Enter obtained Marks");
		double obtained_marks=sc.nextDouble();
		double per=obtained_marks*100/total_marks;
		System.out.println("Percentage is :"+per);
		sc.close();
	}
}
