package com.jamil.uri.iniciante;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int ini,fim, duracao;
		
		ini = input.nextInt();
		fim = input.nextInt();
			
		if(ini == fim){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(ini > fim){
			duracao = (24 - ini) + fim ;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		else if(ini < fim){
			duracao = fim - ini;
			System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		}
		
		input.close();


	}

}
