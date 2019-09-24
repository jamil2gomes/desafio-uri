package com.jamil.uri.iniciante;

import java.util.Scanner;

public class DistanciaEntre2Pontos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Double x1 = s.nextDouble();
		Double y1 = s.nextDouble();
		Double x2 = s.nextDouble();
		Double y2 = s.nextDouble();
		
		double distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		
		System.out.println(String.format("%.4f", distancia));
		
		
		s.close();

	}

}
