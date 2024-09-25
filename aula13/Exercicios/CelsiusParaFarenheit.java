package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius:");
		double temperaturaCelsius = scan.nextDouble();
		double temperaturaFarenheit = 9 * temperaturaCelsius / 5 + 32;
		System.out.println("A temperatura em Farenheit é: " + temperaturaFarenheit);
		
		scan.close();
		
	}
}
