package edu.joao.primeirasemana;
public class MinhaClasse {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String primeiroNome = "João Paulo";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // Acima tempo a varável e o Método nomeCompleto
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
