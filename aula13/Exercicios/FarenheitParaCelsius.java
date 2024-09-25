package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class FarenheitParaCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit:");
		double temperaturaFarenheit = scan.nextDouble();
		double temperaturaCelsius = 5 * (temperaturaFarenheit - 32) / 9;
		System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
		
		scan.close();
	}

}
