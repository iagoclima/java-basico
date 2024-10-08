package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma nota de 0 a 10: ");
        double nota = scan.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Insita um valor válido: ");
            nota = scan.nextDouble();
        }

    }
}
