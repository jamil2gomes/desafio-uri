package com.jamil.uri.iniciante;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		List<Integer> lista = new LinkedList<>();
		
		for (int i = 0; i < 3; i++) {
			lista.add(s.nextInt());
		}
		
		lista.stream().sorted().forEach(System.out::println);
		System.out.println();
		lista.forEach(System.out::println);
		
		s.close();

	}

}
