package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		for(int n = 1; n <= a; n++){
		System.out.print(n + " ");
	}

}
}