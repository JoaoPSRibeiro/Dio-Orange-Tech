package edu.joao.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "João";
        String nomeDois = new String("Joao");

            System.out.println(nomeUm.equals(nomeDois));
                //metodo equals compara conteúdo dos objetos para assim conseguir definir o resultado correto. Ele é o mais indicado para String


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("a nossa condição é   verdadeira");
        }

            System.out.println("O número 1 é igual ao número 2??? " + simNao);

        simNao = numero1 != numero2;
            System.out.println("O número 1 é diferente do número 2??? " + simNao);

        simNao = numero1 > numero2;
            System.out.println("O número 1 é maior que o número 2??? " + simNao);

        simNao = numero1 >= numero2;
            System.out.println("O número 1 é maior ou igual que o número 2??? " + simNao);

        simNao = numero1 < numero2;
            System.out.println("O número 1 é menor que o número 2??? " + simNao);
            
        simNao = numero1 <= numero2;
            System.out.println("O número 1 é menor ou igual que o número 2??? " + simNao);
    }
}
