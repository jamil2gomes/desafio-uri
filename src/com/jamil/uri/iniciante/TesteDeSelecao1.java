package com.jamil.uri.iniciante;

import java.util.Scanner;

public class TesteDeSelecao1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		Integer a = s.nextInt();
		Integer b = s.nextInt();
		Integer c = s.nextInt();
		Integer d = s.nextInt();
		
		if(b > c && d > a && c + d > a + b && c > 0 && d > 0 ) System.out.println("Valores aceitos");
		else System.out.println("Valores nao aceitos");
		s.close();

	}

}
