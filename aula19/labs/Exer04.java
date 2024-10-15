package com.iago.cursojava.aula19.labs;

public class Exer04 {

    public static void main(String[] args) {

        int[] a = new int[5];
        double[] b = new double[5];

        a[0] = 4;
        a[1] = 9;
        a[2] = 16;
        a[3] = 25;
        a[4] = 36;

        for(int i=0; i<a.length; i++){
            b[i] = Math.sqrt(a[i]);
        }

        for(int i=0; i<a.length; i++){
            System.out.println("Vetor A na posição " + (i+1) + " = " + a[i]);
        }

        System.out.println();

        for(int i=0; i<b.length; i++){
            System.out.println("Vetor A na posição " + (i+1) + " = " + b[i]);
        }

    }
}
