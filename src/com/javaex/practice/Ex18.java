package com.javaex.practice;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double hwassi = sc.nextDouble();
		System.out.println("화씨 "+hwassi+"의 섭씨온도는 "+((double)5/9)*(hwassi-32)+"입니다.");
		sc.close();
	}

}
