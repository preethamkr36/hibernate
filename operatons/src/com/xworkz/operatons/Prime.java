package com.xworkz.operatons;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int d = a;
		int n;
		int sum = 0;
		while (d != 0) {
			n = d % 10;

			int i, m = 0, flag = 0;
			m = n / 2;
			if (n == 0 || n == 1) {
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					sum = sum + n;
				}
			}
			d = d / 10;

		}
		System.out.println(sum);
	}
}
