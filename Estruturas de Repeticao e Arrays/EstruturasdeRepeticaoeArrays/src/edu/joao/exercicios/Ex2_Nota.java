package edu.joao.exercicios;

import java.util.Scanner;

public class Ex2_Nota {
 
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        
            System.out.println("Digite a nota: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10){
                System.out.println("Nota Inválida");
                nota = scan.nextInt();
            }

    }
}
