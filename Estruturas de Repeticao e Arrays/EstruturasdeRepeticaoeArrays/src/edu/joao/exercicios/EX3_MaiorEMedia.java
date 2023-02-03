package edu.joao.exercicios;

import java.util.Scanner;

public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int numero;
    int count = 0;
    int soma = 0;
    int maior = 0;
        
    do{
        System.out.println("Número: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if(numero > maior )maior = numero;
        count = count + 1;
        
        }while(count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("A Média dos valores é :"+ (soma/5));
    }
}
