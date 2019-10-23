package com.jamil.uri.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDDVersao2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<String, String> ddd = new HashMap<String, String>();

		ddd.put("61", "Brasilia");
		ddd.put("71", "Salvador");
		ddd.put("11", "Sao Paulo");
		ddd.put("21", "Rio de Janeiro");
		ddd.put("32", "Juiz de Fora");
		ddd.put("19", "Campinas");
		ddd.put("27", "Vitoria");
		ddd.put("31", "Belo Horizonte");

		try {
			System.out.println(ddd.get(input.next()));
		} catch (Exception e) {
			System.out.println("DDD nao cadastrado");
		}

		input.close();

	}

}
