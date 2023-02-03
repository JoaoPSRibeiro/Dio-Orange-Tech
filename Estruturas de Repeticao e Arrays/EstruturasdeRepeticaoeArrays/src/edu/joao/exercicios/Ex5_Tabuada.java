package edu.joao.exercicios;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual tabuada você quer saber ?");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

       for(int i = 1; i <= 10 ; i++ ){
       System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
       }
        
    }
}
