package com.day01;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean fail = false;
		int subMark[] = new int[5];
		int total_marks = 0;
		for (int i = 0; i < subMark.length; i++) {
			System.out.println("Enter Marks for subject :" + (i + 1));
			int temp = sc.nextInt();
			if (temp > 100 || temp < 0) {
				System.out.println("Invalid Marks ");
				break;
			}
			subMark[i] = temp;
		}
		for (int i = 0; i < subMark.length; i++) {
			if (subMark[i] < 40) {
				fail = true;
			}
			total_marks += subMark[i];
		}

//		System.out.println("Total Marks are :"+total_marks);
		if (fail) {
			System.out.println("You are Fail");
		} else {
			int per = (total_marks / 500) * 100;
			if (per > 40 && per < 60) {
				System.out.println("Pass");
			} else if (per > 60 && per < 80) {
				System.out.println("First Class");
			} else {
				System.out.println("Merit");
			}
		}

		sc.close();

	}
}
