package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Area {

	static final double PI = 3.14159;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Double a = s.nextDouble();
		Double b = s.nextDouble();
		Double c = s.nextDouble();
		
		
		Double areaTrianguloRetangulo = (a * c)/2.0;
		Double areaCirculo = PI * Math.pow(c, 2);
		Double areaTrapezio = (a + b)/2.0 * c;
		Double areaQuadrado = Math.pow(b, 2);
		Double areaRetangulo = a * b;
		
		
		System.out.println("TRIANGULO: "+ String.format("%.3f", areaTrianguloRetangulo));
		System.out.println("CIRCULO: "  + String.format("%.3f", areaCirculo));
		System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
		System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
		System.out.println("RETANGULO: "+ String.format("%.3f", areaRetangulo));
		
		
		s.close();

	}

}
