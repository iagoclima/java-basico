package com.iago.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor de A na posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        System.out.println();

        for(int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor de B na posição: " + i);
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.println("Vetor C na posição " + i + " = " + vetorC[i]);
        }

    }
}
