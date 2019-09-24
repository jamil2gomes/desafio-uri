package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int qtd, valor, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;
        qtd = input.nextInt();

        valor = qtd;
        n100 = qtd / 100;
        qtd %= 100;
        n50 = qtd / 50;
        qtd %= 50;
        n20 = qtd / 20;
        qtd %= 20;
        n10 = qtd / 10;
        qtd %= 10;
        n5 = qtd / 5;
        qtd %= 5;
        n2 = qtd / 2;
        qtd %= 2;
        n1 = qtd;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

        input.close();
	}

}
