package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer totalPercorrido = s.nextInt();
		Double totalCombustivelGasto = s.nextDouble();
		
		
		Double cosumoMedio = totalPercorrido/totalCombustivelGasto;
		
		System.out.println(String.format("%.3f", cosumoMedio)+ " km/l");
		
		
		
		s.close();

	}

}
