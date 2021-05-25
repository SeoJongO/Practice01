package com.javaex.practice;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int oback = sc.nextInt();
		System.out.print("100원 개수: ");
		int back = sc.nextInt();
		System.out.print("50원 개수: ");
		int osip = sc.nextInt();
		System.out.print("10원 개수: ");
		int sip = sc.nextInt();
		System.out.println("동전의 총합은 "
				+((oback*500)
				+(back*100)
				+(osip*50)
				+(sip*10))
				+"원 입니다.");
		sc.close();
	}

}
