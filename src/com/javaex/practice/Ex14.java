package com.javaex.practice;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		double garo = sc.nextInt();
		System.out.print("세로를 입력하세요: ");
		double sero = sc.nextInt();
		System.out.println("사각형의 넓이는 "+ garo*sero);
		System.out.println("사각형의 둘레는 "+ (garo+sero)*2);
		sc.close();
	}

}
