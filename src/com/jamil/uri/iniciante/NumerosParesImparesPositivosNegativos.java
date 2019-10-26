package com.jamil.uri.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosParesImparesPositivosNegativos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<Integer>list = new ArrayList<>();
		int i = 0;
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		
		while(i < 5)
		{
			list.add(input.nextInt());
			i++;
		}
		
		for(int j = 0; j < list.size(); j++)
		{
			if(list.get(j) % 2 == 0)
				pares++;
			else if(list.get(j) % 2 != 0)
				impares++;
			
			if(list.get(j) > 0 )
				positivos++;
			else if(list.get(j) < 0 )
				negativos++;
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		
		input.close();
	}

}
