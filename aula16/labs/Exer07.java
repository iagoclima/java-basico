package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, numero;
        int maiorNumero = 0;

        for(i = 0; i < 5; i++){
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println("Maior número = " + maiorNumero);
    }
}
