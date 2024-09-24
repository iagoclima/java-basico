package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva dois números: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println(n1 + n2);
		
		scan.close();

	}

}
