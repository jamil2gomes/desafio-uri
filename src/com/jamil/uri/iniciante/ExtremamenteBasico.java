package com.jamil.uri.iniciante;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int SOMA = A + B;
		
		System.out.println("SOMA = "+ SOMA);
		
		
		scan.close();

	}

}
