package com.jamil.uri.iniciante;

import java.util.Scanner;

public class TempoDeUmEvento {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String valor = in.nextLine();
		String[] dia = valor.split(" ");
		Integer diaInicio = Integer.parseInt(dia[1]);
		

		String horarioInicial = in.nextLine();
		String[] horario = horarioInicial.split(" : ");
		Integer hora = Integer.parseInt(horario[0]);
		Integer min = Integer.parseInt(horario[1]);
		Integer seg = Integer.parseInt(horario[2]);

		String valor2 = in.nextLine();
		String[] dia2 = valor2.split(" ");
		Integer diaFim = Integer.parseInt(dia2[1]);

		String horarioFinal = in.nextLine();
		String[] horario2 = horarioFinal.split(" : ");
		Integer hora2 = Integer.parseInt(horario2[0]);
		Integer min2 = Integer.parseInt(horario2[1]);
		Integer seg2 = Integer.parseInt(horario2[2]);

		Integer d = diaFim - diaInicio;

		Integer h = hora2 - hora;

		if (h < 0) {
			h = 24 + h;
			d = d - 1;
		}

		Integer m = min2 - min;
		if (m < 0) {
			m = 60 + m;
			h = h - 1;
		}

		Integer s = seg2 - seg;
		if (s < 0) {
			s = 60 + s;
			m = m - 1;
		}

		if (d <= 0)
			d = 0;
		
		
		
		System.out.println(d+ " dia(s)");
		System.out.println(h+ " hora(s)");
		System.out.println(m+ " minuto(s)");
		System.out.println(s+ " segundo(s)");
		

		in.close();

	}

}
