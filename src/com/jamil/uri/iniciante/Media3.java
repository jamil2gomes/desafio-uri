package com.jamil.uri.iniciante;

import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		
		 float nota1, nota2, nota3, nota4, media, notaExame,novaMedia;

		  Scanner input =new Scanner(System.in);

		  nota1 =input.nextFloat();

		  nota2 =input.nextFloat();

		  nota3 =input.nextFloat();

		  nota4 =input.nextFloat();

	
		  media =((nota1 * 2)+(nota2 * 3)+( nota3 * 4)+(nota4 * 1))/10;

		 
		  if (media >= 7.0) {

		    System.out.printf("Media: %.1f\n",media);

		    System.out.print("Aluno aprovado.\n");

		  }
		  else if (media >= 5.0 && media <= 6.9) {

		   System.out.printf("Media: %.1f\n",media);

		   System.out.print("Aluno em exame.\n");

		   notaExame =input.nextFloat();

		   System.out.printf("Nota do exame: %.1f\n",notaExame);

		   novaMedia =(media + notaExame) / 2;

		   if (novaMedia >= 5.0) System.out.print("Aluno aprovado.\n");

		   else System.out.print("Aluno reprovado.\n");

		   System.out.printf("Media final: %.1f\n",novaMedia); 

		  }

		  else if (media < 5.0) {
		   System.out.printf("Media: %.1f\n",media);

		   System.out.print("Aluno reprovado.\n");

		  }
		  
		  input.close();
	}

}
