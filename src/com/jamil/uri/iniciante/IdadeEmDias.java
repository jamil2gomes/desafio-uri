package com.jamil.uri.iniciante;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, anos, meses, dias;

		a = input.nextInt();

		anos = a / 365;
		meses = (a % 365) / 30;
		dias = (a % 365) % 30;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		input.close();

	}

}
