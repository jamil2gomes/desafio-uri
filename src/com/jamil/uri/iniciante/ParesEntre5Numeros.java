package com.jamil.uri.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParesEntre5Numeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Double> numeros = new ArrayList<Double>();

		for (int i = 0; i < 5; i++)
			numeros.add(input.nextDouble());

		Integer qtd = (int) numeros.stream().filter(x -> x % 2 == 0).count();

		System.out.println(qtd + " valores pares");

		input.close();
	}
}
