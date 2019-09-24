package com.jamil.uri.iniciante;

import java.util.Scanner;

public class TiposDeTriangulo {

	public static void main(String[] args) {
		double a, b, c;
		Scanner in =new Scanner(System.in);
		
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		double auxA = Math.max(a, Math.max(b, c));
		double auxB = 0;
		double auxC = 0;
		
		// ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
		if (auxA == a) {
			auxB =Math.max(b, c);
			auxC =Math.min(b, c);
		}
		if (auxA == b) {
			auxB =Math.max(a, c);
			auxC =Math.min(a, c);
		}
		if (auxA == c) {
			auxB =Math.max(b, a);
			auxC =Math.min(b, a);
		}
		
		//Classificação dos triangulos
		if (auxA >= (auxB + auxC)) System.out.println("NAO FORMA TRIANGULO");
		
		else if (auxA*auxA > ((auxB*auxB)+(auxC*auxC)))  System.out.println("TRIANGULO OBTUSANGULO");
		
		if (auxA*auxA == ((auxB*auxB)+(auxC*auxC))) System.out.println("TRIANGULO RETANGULO");
		

		if (auxA*auxA < ((auxB*auxB)+(auxC*auxC))) System.out.println("TRIANGULO ACUTANGULO");
		
		if ((auxA == auxB) &&(auxA == auxC)) System.out.println("TRIANGULO EQUILATERO");
		
		if (((auxA == auxB) &&(auxA != auxC)) || ((auxA == auxC) &&(auxA != auxB)) || ((auxB == auxC) &&(auxB != auxA)) ) System.out.print("TRIANGULO ISOSCELES\n");
		
		
		in.close();

	}

}
