package com.fju.mid;

import java.util.Random;

public class DiveRoller {

	public static void main(String[] args) {
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		System.out.print(n3 + " ");
		for (int n = 1; n <= 6; n++) {
		if((n1 == n2) || (n2 == n3) || (n1 == n3)){
			break;
			
		}else{
			System.out.print(n1 + " ");
			System.out.print(n2 + " ");
			System.out.print(n3 + " ");
			System.out.println(" ");
			
			
		}
		
	}

}
}