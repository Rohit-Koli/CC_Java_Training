package com.day01;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature in Fehrenhite :");
		float feh=sc.nextFloat();
		float cel=(feh-32)*5/9;
		System.out.println("Temprature in Celcius is :"+cel);
		sc.close();
	}
}
