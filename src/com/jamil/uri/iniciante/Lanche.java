package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		
		 Integer codigo = s.nextInt();
		 Integer quantidade = s.nextInt();
		 Double total = 0.0;
		 
		 switch (codigo) {
		case 1:
			total = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f\n", total);
			break;
		case 2:
			total = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f\n", total);

			break;
		case 3:
			total = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f\n", total);

			break;
		case 4:
			total = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f\n", total);

			break;
		case 5:
			total = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f\n", total);

			break;

		default:
			break;
		}
		 
		 s.close();
		 
		}

	

}
