package edu.joao.exercicios;

import java.util.Scanner;

/*
    Faça um programa que leia o conjunto de dois valores, o primeiro representando o nome do aluno e o segundo representando a idade
    (Pare o programa inserindo o valor zero no campo nome)
    */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // método para "capturar" dados do teclado

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();             //Ativa o Scanner a atribui à variável nome os dados inseridos (String)
            if(nome.equals("0")) break; // Se, nome for igual a 0, interrompa o programa

            System.out.println("Idade: ");
            idade = scan.nextInt();         // Ativa Scanner e atribui à variável idade os dados inseridos (int)

            // Enquanto não houver o break o programa continuará pedindo nome e idade indefinidamente
            
        }
        System.out.println("Continua aqui...");
    }
}
