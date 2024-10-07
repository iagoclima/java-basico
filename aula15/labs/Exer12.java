package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora trabalhada:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        int percentualIR;
        if(salarioBruto <= 900){
            percentualIR = 0;
        } else if(salarioBruto <= 1500){
            percentualIR = 5;
        } else if(salarioBruto <= 2500){
            percentualIR = 10;
        } else{
            percentualIR = 20;
        }

        double ir = (salarioBruto/100) * percentualIR;
        double inss = (salarioBruto/100) * 10;
        double fgts = (salarioBruto/100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS ( 10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Liquido: " + salarioLiquido);
        
    }
}
