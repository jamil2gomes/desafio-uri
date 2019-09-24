package com.jamil.uri.iniciante;

import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String NOMEVENDEDOR = scan.next();
		Double SALARIOFIXO = scan.nextDouble();
		Double TOTALDEVENDAS = scan.nextDouble();
	
		Double COMISSAO = (TOTALDEVENDAS * 15)/100;
		Double SALARY = COMISSAO + SALARIOFIXO;
		
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", SALARY));
		
		
		scan.close();


	}

}
