package com.jamil.uri.iniciante;

import java.util.Scanner;

public class SeisNumerosImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();
		int qtd = 0;

		while (true)
		{
			if (valor % 2 != 0)
			{
				qtd++;
				System.out.println(valor);
			}
			valor++;
			if (qtd == 6)
				break;
		}

		input.close();
	}
}
