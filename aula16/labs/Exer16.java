package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fibonacci = 0;

        System.out.println("Série de Fibonacci até 500:");

        for(int i=0; fibonacci<=500; i++){
            fibonacci = fibonacci + i;
            System.out.print(fibonacci + "  ");
        }

    }
}
