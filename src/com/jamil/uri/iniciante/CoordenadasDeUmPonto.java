package com.jamil.uri.iniciante;

import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Double x = s.nextDouble();
		Double y = s.nextDouble();
		
		if(x==0 && y==0) System.out.println("Origem");
		
		else if (x > 0 && y > 0) System.out.println("Q1");
		else if (x==0) System.out.println("Eixo Y");
		else if (y==0) System.out.println("Eixo X");
		else if (x < 0 && y > 0) System.out.println("Q2");
		else if (x < 0 && y > 0) System.out.println("Q2");
		else if (x < 0 && y < 0) System.out.println("Q3");
		else if (x > 0 && y < 0) System.out.println("Q4");
		
		s.close();

	}

}
