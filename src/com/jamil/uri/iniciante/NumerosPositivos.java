package com.jamil.uri.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Double> numeros = new ArrayList<Double>();
		
		for(int i = 0; i<6;i++)
			numeros.add(input.nextDouble());
		
		
		Integer qtd = (int) numeros.stream().filter(x-> x > 0).count();
		
	    
		System.out.println(qtd + " valores positivos");
			
		

		input.close();
	}
}
