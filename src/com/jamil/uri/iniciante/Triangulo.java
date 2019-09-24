package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Double a,b,c,perm,area;
		Scanner in = new Scanner(System.in);
		
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		 if(a+b > c && b+c > a && a+c > b ){
			 perm = a + b + c;
			 System.out.println("Perimetro = "+String.format("%.1f", perm));
		 }else {
			 area=(a + b)/2.0 * c;
			 System.out.println("Area = "+String.format("%.1f", area));
		 }
		
		
		in.close();
		

	}

}
