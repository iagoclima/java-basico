package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double paisA = 80000;
        double paisB = 200000;
        double percentualA = 3;
        double percentualB = 1.5;

        int contAnos = 0;
        while(paisA <= paisB){
            paisA = paisA + (paisA/100*percentualA);
            paisB = paisB + (paisB/100*percentualB);
            contAnos++;
        }

        System.out.println("População A: " + paisA);
        System.out.println("População B: " + paisB);
        System.out.println("A quantidade de anos necessária para a população de A ultrapassar B é de " + contAnos + " anos.");
        
    }
}
