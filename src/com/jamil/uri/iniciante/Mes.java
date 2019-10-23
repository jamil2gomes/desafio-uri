package com.jamil.uri.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<String, String> mes = new HashMap<String, String>();

		mes.put("1", "January");
		mes.put("2", "February");
		mes.put("3", "March");
		mes.put("4", "April");
		mes.put("5", "May");
		mes.put("6", "June");
		mes.put("7", "July");
		mes.put("8", "August");
		mes.put("9", "September");
		mes.put("10", "October");
		mes.put("11", "November");
		mes.put("12", "December");
		
		
		System.out.println(mes.get(input.next()));
		

		input.close();

	}

}
