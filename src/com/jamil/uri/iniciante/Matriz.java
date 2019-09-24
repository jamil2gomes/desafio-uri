package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		Scanner s = new Scanner(System.in);
		String escolha = s.next();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = s.nextInt();
			}
		}

		switch (escolha) {
		case "S":
			somaAbaixoDaDiagonalSegundaria(matriz);
			break;
		case "M":	
			mediaAbaixoDaDiagonalSegundaria(matriz);
			break;

		default:
			break;
		}

		s.close();

	}
	
	
	public static void somaAbaixoDaDiagonalSegundaria(int matriz[][]) {
		double soma = 0.0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i + j >= matriz.length) {

					soma += matriz[i][j];
				}
			}
		}
		System.out.println(String.format("%.1f", soma));
	}
	
	
	public static void mediaAbaixoDaDiagonalSegundaria(int matriz[][]) {
		double soma = 0.0;
		double media = 0.0;
		int total = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i + j >=  matriz.length) {
					soma += matriz[i][j];
					total++;
				}
			}
		}
		media = soma/total;
		
		System.out.println(String.format("%.1f", media));
	}

}
