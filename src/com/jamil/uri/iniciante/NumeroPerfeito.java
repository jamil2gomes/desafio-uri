package com.jamil.uri.iniciante;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantidadeDeTestes = s.nextInt();
		int soma;
		int elemento;
		
		for (int i = 0; i < quantidadeDeTestes; i++) {
			elemento = s.nextInt();
			soma = 0;
			for (int j = 1; j < elemento; j++) 
				 if ( (elemento % j) == 0) 
					 	soma += j;
			
			if (soma == elemento)
				System.out.println(elemento +" eh perfeito");
			else
				System.out.println(elemento + " nao eh perfeito");
		}
		
	
		s.close();          		
		
	}
}
