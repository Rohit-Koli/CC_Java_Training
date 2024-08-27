package com.day02;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 ");
		int n1= sc.nextInt();
		System.out.println("Enter Num2 ");
		int n2=sc.nextInt();
//		sc.next();
		System.out.println("What Operation you want to do on this numbers ");
		char op=sc.next().charAt(0);
		System.out.println();
		switch (op) {
		case '+':
			System.out.println("Addition is "+(n1+n2));
			break;
		case '-':
			System.out.println("Substraction is "+(n1-n2));
			break;
		case '/':
			System.out.println("Division is"+(n1/n2));
			break;
		case '*':
			System.out.println("Multiplication is "+(n1*n2));
			break;
		default:
			System.out.println("Enter Valid Operator");
		}
		sc.close();
	}
}
