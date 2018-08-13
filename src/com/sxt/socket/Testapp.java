package com.sxt.socket;

import java.util.Scanner;

public class Testapp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		String numStr1 = ""+num;
		String numStr2 ="";
		for (int i = 1; i <= numStr1.length(); i++) {
			numStr2=numStr2+num%10;
			num=num/10;
			
		}
		num = Integer.parseInt(numStr2);
		System.out.println(num);
	}
}
