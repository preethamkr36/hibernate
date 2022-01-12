package com.xworkz.operatons;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int[] freq = new int[str.length()];
		
		int i, j;

		char string[] = str.toCharArray();

		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					string[j] = '0';
				}
			}
		}
		int l = 0;
		for (int k = 0; k < freq.length; k++) {
			if (freq[k] > l) {
				l = freq[k];
			}
		}
		System.out.println(l);
	}
}
