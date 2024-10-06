package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        
       System.out.println("Digite a letra do sexo(F ou M):");
       String sexo = scan.next();

       if(sexo.equalsIgnoreCase("M")){
           System.out.println("M - Masculino");
       } else if (sexo.equalsIgnoreCase("F")){
           System.out.println("F - Feminino");
        } else{
           System.out.println("Sexo Inválido");
        }
    }
}
