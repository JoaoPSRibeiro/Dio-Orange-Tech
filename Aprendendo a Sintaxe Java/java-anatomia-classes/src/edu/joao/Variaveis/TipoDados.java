package edu.joao.Variaveis;

public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez haja erro de compilação, o ideal é usar String
        long cpf = 98765432109L;  // se começar com zero, talvez haja erro de compilação, o ideal é usar String e no long é obrigatório colocar o L no final
        float PI = 3.14F; // no float é obrigatório colocar o F no final
        double salario = 1275.33;

            System.out.println("minha idade é " + idade);
            System.out.println(ano);
            System.out.println(cep);
            System.out.println(cpf);
            System.out.println(PI);
            System.out.println(salario);
    }
}
