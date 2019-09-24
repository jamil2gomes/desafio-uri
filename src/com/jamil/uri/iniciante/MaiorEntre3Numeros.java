package com.jamil.uri.iniciante;

import java.util.Scanner;

public class MaiorEntre3Numeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer a = s.nextInt();
		Integer b = s.nextInt();
		Integer c = s.nextInt();
		
		
		Integer maiorAB = (a+b+Math.abs(a-b))/2;
		Integer maiorBC = (b+c+Math.abs(b-c))/2;
		
		if(maiorAB > maiorBC)
			System.out.println(maiorAB+ " eh o maior");
		else
			System.out.println(maiorBC+ " eh o maior");
		
		
		s.close();

	}

}
