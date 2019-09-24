package com.jamil.uri.iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer n = s.nextInt();
		
		Integer horas = n/3600;
		
		Integer minutos = (n % 3600) / 60;
		Integer seg = (n % 3600) % 60;
		
		System.out.println(horas+":"+minutos+":"+seg);
		
		
		s.close();

	}

}
