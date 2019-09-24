package com.jamil.uri.iniciante;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Integer horasGastas = s.nextInt();
		
		Integer velocidadeMedia = s.nextInt();
		
		Double distancia = (double) (horasGastas * velocidadeMedia);
		
		Double quantidadeLitros = distancia/12;
		
		System.out.println(String.format("%.3f", quantidadeLitros));
		s.close();
	}

}
