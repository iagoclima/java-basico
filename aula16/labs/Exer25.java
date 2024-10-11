package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor dos produtos:");

        System.out.println("Lojas Tabajara");

        double valorProduto = -1;
        double totalCompra = 0;
        for(int i=1; valorProduto!=0; i++){
            System.out.println("Produto " + i + ": ");
            valorProduto = scan.nextDouble();

            totalCompra += valorProduto;
        }

        System.out.println("Total; R$" + totalCompra);

        System.out.println("Dinheiro: R$");
        double dinheiro = scan.nextDouble();

        double troco = dinheiro - totalCompra;

        System.out.println("Troco: R$" + troco);

    }
}
