package com.samsung.ssm1_2;

import java.util.Scanner;

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
		if (n < 10)
			return n + "";
		else {
			if (n % 10 == 0) {
				hexa += "a";
			} else if (n % 11 == 0) {
				hexa += "b";
			} else if (n % 12 == 0) {
				hexa += "c";
			} else if (n % 13 == 0) {
				hexa += "d";
			} else if (n % 14 == 0) {
				hexa += "e";
			}
		}

		return hexa += getHexa(n - 1);
	}

}
