package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer NUMBER = scan.nextInt();
		Integer HORASTRABALHADAS = scan.nextInt();
		Double VALORPORHORA = scan.nextDouble();
	
		
		Double SALARY = HORASTRABALHADAS * VALORPORHORA;
		
		System.out.println("NUMBER = "+ NUMBER);
		System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
		
		
		scan.close();

	}

}
