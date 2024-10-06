package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do Produto 01:");
        double preco1 = scan.nextDouble();

        System.out.println("Digite o preço do Produto 02:");
        double preco2 = scan.nextDouble();

        System.out.println("Digite o preço do Produto 03:");
        double preco3 = scan.nextDouble();

        String menorPreco;
        if(preco1 < preco2 && preco1 < preco3){
            menorPreco = "Produto 01";
        } else if(preco2 < preco3){
            menorPreco = "Produto 02";
        } else{
            menorPreco = "Produto 03";
        }

        System.out.println("Pelo menor preço, você deve comprar o " + menorPreco);

    }
}
