package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o valor do raio de um círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é: " + area + "m2");
		
		scan.close();

	}
}
