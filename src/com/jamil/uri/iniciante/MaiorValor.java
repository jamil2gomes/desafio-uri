package com.jamil.uri.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {

			lista.add(s.nextInt());

		}

		int maior = 0;
		int posicao = 0;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > maior) {
				maior = lista.get(i);
				posicao = lista.indexOf(maior);

			}
		}

		System.out.println(maior);
		System.out.println(posicao + 1);

		s.close();

	}

}
