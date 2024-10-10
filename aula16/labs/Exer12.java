package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número da tabuada do 1 ao 10:");
        int numero = scan.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
