package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário atual do colaborador: ");
        double salarioAtual = scan.nextDouble();

        double reajuste;
        String percentualReajuste;
        if (salarioAtual <= 280) {
            reajuste = salarioAtual * 0.20;
            percentualReajuste = "20%";
        } else if (salarioAtual <= 700) {
            reajuste = salarioAtual * 0.15;
            percentualReajuste = "15%";
        } else if (salarioAtual <= 1500) {
            reajuste = salarioAtual * 0.10;
            percentualReajuste = "10%";
        } else {
            reajuste = salarioAtual * 0.05;
            percentualReajuste = "5%";
        }

        double novoSalario = salarioAtual + reajuste;

        System.out.println("Salario antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento: " + percentualReajuste);
        System.out.println("Valor do aumento: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);

    }
}


