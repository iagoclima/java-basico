package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreve um número em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		System.out.println("O valor do número em metros convertido para centímetros é: " + centimetros);
		
		
		scan.close();

	}

}
