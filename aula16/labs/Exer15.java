package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fibonacci = 0;

        System.out.println("Digite um número n:");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            fibonacci = fibonacci + i;
            System.out.print(fibonacci + " - ");
        }
        
    }
}
