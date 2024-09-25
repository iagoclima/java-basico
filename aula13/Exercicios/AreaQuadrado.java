package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado de um quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		System.out.println("O valor da área do quadrado é: " + area);
		double dobroDaArea = 2 * area;
		System.out.println("O valor do dobro da área do quadrado é: " + dobroDaArea);
		
		scan.close();
	}
}
