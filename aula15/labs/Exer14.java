package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota(0 a 10):");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota(0 a 10):");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;

        if(media <= 4){
            conceito = "E";
        } else if(media <= 6){
            conceito = "D";
        } else if(media <= 7.5){
            conceito = "C";
        } else if(media <= 9){
            conceito = "B";
        } else{
            conceito = "A";
        }

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

    }
}
