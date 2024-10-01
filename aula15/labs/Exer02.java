package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double n1 = scan.nextDouble();

        if(n1 < 0){
            System.out.println("É negativo");
        } else{
            System.out.println("É positivo");
        }
    }
}
