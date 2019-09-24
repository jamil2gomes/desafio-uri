package com.jamil.uri.iniciante;

import java.util.Scanner;

public class TempoDeJogoComMinutos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int horaInicial,minutoInicial, horaFinal, minutoFinal, duracaoHoras,duracaoMinutos;
		
		horaInicial = teclado.nextInt();
		minutoInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();
		minutoFinal = teclado.nextInt();
			
		if(horaInicial == horaFinal && minutoInicial == minutoFinal) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		
		else if(horaInicial > horaFinal)
		{
			duracaoHoras = (24 - horaInicial) + horaFinal ;
			
			if(minutoInicial>minutoFinal)
			{
				duracaoMinutos = 60- minutoInicial +minutoFinal;
				duracaoHoras--;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
			else if(minutoInicial <= minutoFinal)
			{
				duracaoMinutos = minutoFinal - minutoInicial ;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
		}
		else if(horaInicial <= horaFinal)
		{
			duracaoHoras = horaFinal - horaInicial;

			if(minutoInicial>minutoFinal)
			{
				duracaoMinutos = 60- minutoInicial +minutoFinal;
				duracaoHoras--;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
			else if(minutoInicial <= minutoFinal)
			{
				duracaoMinutos = minutoFinal - minutoInicial ;
				System.out.println("O JOGO DUROU "+duracaoHoras+" HORA(S) E "+duracaoMinutos+" MINUTO(S)");
			}
		}

		
		teclado.close();

	}

}
