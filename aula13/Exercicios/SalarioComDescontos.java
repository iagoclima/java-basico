package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class SalarioComDescontos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mês?");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorPorHora * horasTrabalhadas;
		double descontoImpostoDeRenda = salarioBruto * 0.11;
		double descontoInss = salarioBruto * 0.08;
		double descontoSindicato = salarioBruto * 0.05; 
		double salarioLiquido = salarioBruto - descontoImpostoDeRenda - descontoInss - descontoSindicato;
		
		System.out.println("Salario bruto : " + salarioBruto);
		System.out.println("Desconto imposto de renda : " + descontoImpostoDeRenda);
		System.out.println("Desconto INSS : " + descontoInss);
		System.out.println("Desconto sindicato : " + descontoSindicato);
		System.out.println("Salário Líquido : " + salarioLiquido);
		
		scan.close();

	}
}
