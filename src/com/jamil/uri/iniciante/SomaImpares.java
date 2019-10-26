package com.jamil.uri.iniciante;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		int x, y, total = 0;
		Scanner input =new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		
		if (x > y) {
			for (int i = x - 1; i > y; i--) {
				if (i % 2 != 0) {
					total += i;
				}
			}
		}else {
			for (int i = y - 1; i > x; i--) {
				if (i % 2 != 0) {
					total += i;
				}
			}
		}
		
		System.out.print(total+"\n");
		input.close();

	}

}
