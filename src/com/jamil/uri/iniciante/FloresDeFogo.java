package com.jamil.uri.iniciante;

import java.util.Scanner;

public class FloresDeFogo {

	public static void main(String[] args) {
		Integer r1,x1,y1,r2,x2,y2;
	    Double distancia;
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			r1 = in.nextInt();
			x1 = in.nextInt();
			y1 = in.nextInt();
			r2 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt();
			
			 distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			 
			 if(r1 >= distancia+r2) System.out.println("RICO");
             else System.out.println("MORTO");
		}
		
		
		
		
		in.close();

	}

}
