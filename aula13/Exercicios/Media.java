package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira as 4 notas bimestrais: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		System.out.println("O valor da média é: " + media);
		
		scan.close();		

	}

}
