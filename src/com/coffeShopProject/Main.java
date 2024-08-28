package com.coffeShopProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt = 0;
		int teaCount=0,confCount=0,bunCount=0,waterCount=0;
		boolean flag = true;
		System.out.println("Do You Want to Order Something ?(Y/N)");
		String or = sc.nextLine();
		if (or.equals("Y")) {
			while (flag) {
				System.out.println("1.Chai\t10 \n2.Coffee\t25\n3.BanMaska\t25\n4.Water\t20 \nExit\t0");
				System.out.println("Enter Your Choice ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Tea Selected");
					teaCount++;
					amt += 10;
					break;
				case 2:
					System.out.println("Coffee Selected");
					confCount++;
					amt += 25;
					break;
				case 3:
					System.out.println("BanMaska Selected");
					bunCount++;
					amt += 25;
					break;
				case 4:
					System.out.println("Water Selected");
					waterCount++;
					amt += 20;
					break;
				default:
					flag = false;
					break;
				}
			}
		} 		
		BillCard billCard = new BillCard();
		billCard.getBill(teaCount, confCount, bunCount, waterCount,amt);
		System.out.println("Thanks ..........");
		sc.close();
	}
}
