package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Notas {

	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		
		
		
		
		
		s.close();

	}
	
	public static boolean notaValida(Double nota) {
		
		if(nota<0 || nota>10) {
			return false;
		}
		
		return true;
	}

}
