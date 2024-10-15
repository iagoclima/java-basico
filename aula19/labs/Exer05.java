package com.iago.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um valor no vetor A na posição : " + i);
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i< vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
        }

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Vetor A na posição " + i + " = " + vetorA[i]);
        }

        System.out.println();

        for(int i=0; i< vetorB.length; i++){
            System.out.println("Vetor A na posição " + i + " = " + vetorB[i]);
        }


    }
}
