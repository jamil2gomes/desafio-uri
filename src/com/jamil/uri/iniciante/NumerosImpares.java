package com.jamil.uri.iniciante;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor = in.nextInt();
		
		
		for(int i = 1; i <= valor; i++)
			if(i % 2 != 0)
				System.out.println(i);
		
		
		
		in.close();
		

	}

}
