package com.jamil.uri.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPositivosEMedia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Float> numeros = new ArrayList<Float>();
		
		for(int i = 0; i<6;i++)
			numeros.add(input.nextFloat());
		
		
		Integer qtd = (int) numeros.stream().filter(x-> x > 0).count();
		Double media = numeros.stream().filter(x-> x > 0).mapToDouble(x->x).average().getAsDouble();
		
		System.out.println(qtd + " valores positivos");
		System.out.println(String.format("%.1f", media));
		
		
		
		
		
	
		
		
		
		input.close();
	}
}
