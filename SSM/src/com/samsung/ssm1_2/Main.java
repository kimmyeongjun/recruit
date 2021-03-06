package com.samsung.ssm1_2;

import java.util.Scanner;

/*
 * 2016.02.02
 * by KMJ
 */
//10진수 n을 입력 받고 n을 16진수로 변환하여 출력하시오.(단, 재귀함수를 사용할 것)


public class Main {
	private static int T;
	private static int n[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		n = new int[T];

		for (int i = 0; i < T; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++) {
			System.out.println("#testcase" + (i + 1));
			System.out.println(getHexa(n[i]));
		}

		sc.close();
	}

	public static String getHexa(int n) {
		String hexa = "";
		if (n > 15) {
			hexa+=getHexa(n/16);
		}		
		
		if (n % 16 == 10) {
			hexa += "a";
		} else if (n % 16 == 11) {
			hexa += "b";
		} else if (n % 16 == 12) {
			hexa += "c";
		} else if (n % 16 == 13) {
			hexa += "d";
		} else if (n % 16 == 14) {
			hexa += "e";
		} else if (n % 16 == 15) {
			hexa += "f";
		} else {
			hexa += (n%16);
		}
		
		return hexa;
	}

}
