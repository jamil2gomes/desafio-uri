package com.jamil.uri.iniciante;

import java.util.Scanner;
import static java.lang.Math.pow;

public class VolumeDaCircunferencia {

	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double raio = scan.nextDouble();
		
		Double VOLUME = (4 * PI * pow(raio, 3.0))/3.0;
		
		System.out.println("VOLUME = " + String.format("%.3f", VOLUME));
		
		scan.close();
	}
}
