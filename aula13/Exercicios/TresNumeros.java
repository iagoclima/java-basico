package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros e um número real:");
		System.out.println("Primeiro número:");
		int primeiroNumero = scan.nextInt();
		System.out.println("Segundo número:");
		int segundoNumero = scan.nextInt();
		System.out.println("Terceiro número:");
		double terceiroNumero = scan.nextDouble();
		
		double a = (2 * primeiroNumero) * (segundoNumero / 2);
		double b = 3 * primeiroNumero + terceiroNumero;
		double c = Math.pow(terceiroNumero, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
		System.out.println("O terceiro elevado ao cubo: " + c);
		
		scan.close();
	}
}
