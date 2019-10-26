package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Intervalo2 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int dentro = 0, fora = 0;
		
		int qtd = in.nextInt();
		
		for (int i = 0; i < qtd; i++)
		{
			int valor = in.nextInt();
			if(10 >= valor && valor <= 20)
				dentro++;
			else
				fora++;		
		}
		
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		in.close();

	}

}
