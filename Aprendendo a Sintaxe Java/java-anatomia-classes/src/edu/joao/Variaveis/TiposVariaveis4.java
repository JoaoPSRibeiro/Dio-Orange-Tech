package edu.joao.Variaveis;

public class TiposVariaveis4 {
    

public static void main(String[] args) {
    int numero = 1;
        System.out.println(numero);

    numero = 2; // a variável numero pode sofrer alteração no decorrer do desenvolvimento da apicação
        System.out.println(numero);

    final int TESTE = 5; // o termo final no ínicio  faz com que numero se torne uma constante, este não pode ser alterado mais, porém, deve ser declarado em caixa alta

        System.out.println("o valor de TESTE é " + TESTE);
}
}
