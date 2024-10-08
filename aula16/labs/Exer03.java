package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o  nome(maior que 3 caracteres): ");
        String nome = scan.next();
        System.out.println("Entre com a idade(entre 0 e 150):");
        int idade = scan.nextInt();
        System.out.println("Entre com o salário(maior que zero): ");
        double salario = scan.nextDouble();
        System.out.println("Entre com o seu estado civil(s, c, v, d): ");
        String estadoCivil = scan.next();

        if(nome.length() > 3){
            System.out.println("Nome válido!");
        } else{
            System.out.println("Nome inválido!");
        }

        if(idade >= 0 && idade <= 150){
            System.out.println("Idade válida!");
        } else{
            System.out.println("Idade inválida!");
        }

        if(salario > 0 ){
            System.out.println("Salário válido!");
        } else{
            System.out.println("Salário inválido!");
        }

        if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){

            System.out.println("Estado civil válido!");
        } else{
            System.out.println("Estado civil inválido!");
        }

    }
}
