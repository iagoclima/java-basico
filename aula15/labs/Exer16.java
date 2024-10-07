package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Para uma raiz quadrada ax2 + bx + c = 0, determine os coeficientes a, b e c:");
        System.out.println("Digite o valor de a: ");
        double a = scan.nextDouble();
        if(a == 0){
            System.out.println("Não é equação de segundo grau. Programa encerrado.");
        } else{
            System.out.println("Digite o valor de b:");
            double b = scan.nextDouble();

            System.out.println("Digite o valor de c:");
            double c = scan.nextDouble();

            double delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Não possuí raízes. Programa encerrado.");
            } else if (delta == 0){
                double raiz = -b / (2*a);
                System.out.println("Raiz = " + raiz);
            }else{
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
