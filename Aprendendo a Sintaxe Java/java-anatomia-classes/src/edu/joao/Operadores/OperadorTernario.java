package edu.joao.Operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso"; // se a==b for (?) true imprima  verdadeiro  senão (:) imprima falso ((Com isso o valor é atribuido à variável)) é possivel alterar o tipo da variavel, respeitando suas caracteristicas padrões.
      /* 
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
            */

        System.out.println(resultado);
    }
}
