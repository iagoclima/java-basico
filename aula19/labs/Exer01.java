package com.iago.cursojava.aula19.labs;

public class Exer01 {

    public static void main(String[] args) {

        int[] vetA = new int[5];
        int[] vetB = new int[5];

        vetA[0] = 1;
        vetA[1] = 2;
        vetA[2] = 3;
        vetA[3] = 4;
        vetA[4] = 5;

        vetB = vetA;

        for(int i=0; i<vetA.length; i++){
            System.out.println("Vetor A na posição " + (i+1) + " = " + vetA[i]);
            System.out.println("Vetor B na posição " + (i+1) + " = " + vetB[i]);
        }
    }
}
