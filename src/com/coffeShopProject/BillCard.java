package com.coffeShopProject;

public class BillCard {
	public static void main(String[] args) {
		
	}
	public void getBill(int tea,int cof,int bun,int water,int amt) {
		System.out.println("Bill No : 100010");
		if(tea>0)
			System.out.println("Tea\t10\t"+tea+"\t"+(tea*10));
		if(cof>0)
			System.out.println("Coffee\t25"+cof+"\t"+(cof*25));
		if(bun>0)
			System.out.println("MaskaBun\t25"+bun+"\t"+(bun*25));
		if(water>0)
			System.out.println("Water \t20"+water+"\t"+(water*25));
		System.out.println("Total Amount is :"+amt);
	}
}
