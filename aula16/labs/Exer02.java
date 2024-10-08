package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do usuário: ");
        String nome = scan.next();
        System.out.println("Crie uma senha para o usuário(não pode ser igual ao nome): ");
        String senha = scan.next();

        while(senha.equals(nome)){
            System.out.println("Senha inválida! Tente novamente! ");
            System.out.println("");
            System.out.println("Entre com o nome do usuário: ");
            nome = scan.next();
            System.out.println("Crie uma senha para o usuário(não pode ser igual ao nome): ");
            senha = scan.next();
        }

        System.out.println("Conta criada com sucesso!");

    }
}
