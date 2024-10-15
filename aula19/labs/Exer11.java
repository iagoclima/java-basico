package com.iago.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A na posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int contPares = 0;
        for(int i=0; i<vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                contPares++;
            }
        }

        System.out.println();

        System.out.println("Quantidade de elementos pares = " + contPares);

    }
}
