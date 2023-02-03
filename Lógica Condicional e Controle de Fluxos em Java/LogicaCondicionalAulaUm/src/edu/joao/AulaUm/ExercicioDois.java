package edu.joao.AulaUm;

public class ExercicioDois {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("B1 && B2 é:  " + (b1 && b2));
        System.out.println("B1 && B3 é:  " + (b1 && b3));

        System.out.println("B2 || B3 é:  " + (b2 || b3));
        System.out.println("B2 || B4 é:  " + (b2 || b4));
        
        System.out.println("B1 ^ B3 é:  " + (b1 ^ b3));
        System.out.println("B4 ^ B1 é:  " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("(i1 > i2) || (f2 < f1) é:  " + ((i1 > i2) || (f2 < f1)));
        System.out.println("(i1 + i2) < (f2 - f1) && true é:  " + ((i1 + i2) < (f2 - f1) && true));

            //Incio código do auxílio

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario; // reduzimos para uma variável o quesito salário
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes; // reduzimos para uma variável a quantidade de dependentes

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio ? " + recebeAuxilio);
    }

}
