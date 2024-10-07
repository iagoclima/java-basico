package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em qual turno você estuda? Matutino(M), Vespertino(V) ou Noturno(N)");
        String turno = scan.next();

        if(turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        } else if(turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde!");
        } else if(turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        } else{
            System.out.println("Valor inválido!");
        }
    }
}
