package com.jamil.uri.iniciante;

import java.util.Scanner;

public class CalculoSimples {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double []peca1 = new double [3];
		double []peca2 = new double [3];
		
		for (int i = 0; i < peca1.length; i++) {
			peca1[i] = s.nextDouble();
		}
		
		for (int i = 0; i < peca2.length; i++) {
			peca2[i] = s.nextDouble();
		}
		
		double valor = peca1[1] * peca1[2] + peca2[1] * peca2[2];
		
		System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f",valor));
		
		
		s.close();
	}

}
