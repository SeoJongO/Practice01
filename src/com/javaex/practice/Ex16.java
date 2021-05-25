package com.javaex.practice;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		double price = sc.nextInt();
		System.out.print("받은돈: ");
		double money = sc.nextInt();
		System.out.println(
				"받은돈: "	+money+
				"\n상품가격: "	+price+
				"\n부가세: "	+(price/10)+
				"\n잔액: "	+(money-price)
				);
		sc.close();
	}

}
