package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int contPar = 0;
        int contImpar = 0;

        for(int i=0; i<10; i++){
            System.out.println("Entre com um número inteiro:");
            num = scan.nextInt();

            if(num%2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
        }

        System.out.println("Quantidade par: " + contPar);
        System.out.println("Quantidade ímpar: " + contImpar);

    }
}
