package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Salario {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorPorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha no mês?");
		int horasTrabalhadas = scan.nextInt();
		
		double salario = valorPorHora * horasTrabalhadas;
		System.out.println("O seu salário no mês será: " + salario);
		
		scan.close();
		
	}
}
