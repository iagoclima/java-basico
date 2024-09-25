package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura de uma pessoa:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("O peso ideal para essa pessoa é: " + pesoIdeal);
		
		scan.close();

	}
}
