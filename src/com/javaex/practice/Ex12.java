package com.javaex.practice;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		int circle = sc.nextInt() ;
		System.out.println("원의 넓이는 "+circle*circle*pi);
		sc.close();
	}

}
