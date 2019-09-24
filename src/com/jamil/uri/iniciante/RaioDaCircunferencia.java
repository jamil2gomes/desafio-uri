package com.jamil.uri.iniciante;

import java.util.Scanner;

public class RaioDaCircunferencia {

	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double raio = scan.nextDouble();
		
		Double A = PI * Math.pow(raio, 2.0);
		
		System.out.println("A=" + String.format("%.4f", A));
		
		scan.close();
	}
}
