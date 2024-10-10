package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, maior, menor;
        int soma = 0;

        System.out.println("Entre com um número inteiro:");
        int num1 = scan.nextInt();
        System.out.println("Entre com outro número inteiro:");
        int num2 = scan.nextInt();

        if(num1 > num2){
            maior = num1;
            menor = num2;
        } else{
            maior = num2;
            menor = num1;
        }

        System.out.println("O intervalo entre os números é:");
        for(i = menor + 1; i < maior; i++){
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("Soma dos números do intervalo = " + soma);

    }
}
