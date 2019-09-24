package com.jamil.uri.iniciante;

import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double salario, novoSalario = 0.0, reajuste = 0.0;
		int percentual = 0;
		
		salario = input.nextDouble();
		
		if(salario>=0 && salario<=400)
		{
			novoSalario = salario + (salario * (15/100.0));
			reajuste = salario * (15/100.0);
			percentual = 15;
			
			
		}else if (salario >= 400.01 && salario <= 800.00) {
			
			novoSalario = salario + (salario * (12/100.0));
			reajuste = salario * (12/100.0);
			percentual = 12;
		}else if (salario >= 800.01 && salario <= 1200.00) {
			
			novoSalario = salario + (salario * (10/100.0));
			reajuste = salario * (10/100.0);
			percentual = 10;
		}else if (salario >= 1200.01 && salario <= 2000.00) {
			
			novoSalario = salario + (salario * (7/100.0));
			reajuste = salario * (7/100.0);
			percentual = 7;
		}else if (salario >= 2000.01) {
			
			novoSalario = salario + (salario * (4/100.0));
			reajuste = salario * (4/100.0);
			percentual = 4;
		}
		
		System.out.println("Novo salario: "+String.format("%.2f", novoSalario));
		System.out.println("Reajuste ganho: "+String.format("%.2f", reajuste));
		System.out.println("Em percentual: "+percentual+" %");
		
		input.close();

	}

}
