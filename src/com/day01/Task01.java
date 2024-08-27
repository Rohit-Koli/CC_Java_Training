package com.day01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
		String name=sc.nextLine();
//		sc.next();
		System.out.println("Enter Hobby ");
		String Hobby=sc.nextLine();
//		sc.next();
		System.out.println("Enter Address ");
		String Address=sc.nextLine();
		System.out.println("Name is "+name+"\nHobby is :"+Hobby+"\nAddress :"+Address);
		sc.close();
	}

}
