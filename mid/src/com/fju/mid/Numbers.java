package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		for (int n = 1; n <= a; n++) {

			if ((n % 5) == 0) {
				System.out.print("# ");
			}
			System.out.print(n + " ");
			if (n == 10) {
				break;
			}
		}

	}
}
