package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double A = scan.nextDouble();
		Double B = scan.nextDouble();
		Double C = scan.nextDouble();
		
		
		Double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0 )/10.0;
		System.out.println("MEDIA = "+String.format("%.1f", MEDIA));
		
		
		scan.close();
				

	}

}
