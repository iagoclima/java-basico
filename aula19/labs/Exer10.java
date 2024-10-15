package com.iago.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um valor para o vetor A na posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        
        for(int i=0; i<vetorB.length; i++){
            System.out.println("Vetor B na posição " + i + " = " + vetorB[i]);
        }

    }
}
