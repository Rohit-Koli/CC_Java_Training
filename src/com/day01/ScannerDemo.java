package com.day01;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n=sc.nextInt();
//		System.out.println("The Square is :"+(n*n));
//		
//		System.out.println("Enter Radius of Circe ");
//		float rad=sc.nextFloat();
//		System.out.println("Radius is :"+(Math.PI*rad*rad));
//		sc.close();
		
		System.out.println("Enter Name ");
		String name=sc.nextLine();
		System.out.println("Name is "+name);
		sc.close();
	}
}
