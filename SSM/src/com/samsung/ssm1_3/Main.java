package com.samsung.ssm1_3;

import java.util.Scanner;

/*
 * 2016.02.02
 * by KMJ
 */
// (0+1)+(1+2)+(2+3)....의 순으로 진행되는 항이 있다. n번째 항까지의 합을 구하시오.

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
			System.out.println(getSum(n[i]));
		}

		sc.close();
	}

	public static int getSum(int n) {
		return n * n;
	}

}
