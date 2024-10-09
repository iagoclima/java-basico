package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i;
        int qtdNumero = 0;
        double soma = 0;
        double media, numero;

        for(i=0; i<5; i++){
            System.out.println("Digite um número:");
            numero = scan.nextDouble();
            soma = soma + numero;
            qtdNumero++;
        }

        media = soma / qtdNumero;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média: " + media);
    }
}
