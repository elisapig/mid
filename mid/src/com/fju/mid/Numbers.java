package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("�п�J�@�ӼƦr");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int a = Integer.parseInt(line);
		for(int n = 1; n <= a; n++){
		System.out.print(n + " ");
	}

}
}