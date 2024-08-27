package com.day01;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		int yr=sc.nextInt();
		if(yr%4==0 && (yr%100!=0 || yr%400==0)) {
			System.out.println(yr+" is a Leap Year");
		}else {
			System.out.println(yr+" is not a Leap Year");
		}
		sc.close();
	}
}
