public class Usuario {
  
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv(); // Aqui, estamos fazendo com que Usuario interaja com SmartTv, chamando a classe e criando um novo objeto. Lá em SmartTv, criaremos os métodos que serão chamados abaixo

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarCanal();

            smartTv.mudarCanal(13);

            System.out.println("TV Ligada? " + smartTv.ligada);
            System.out.println("Canal Atual: " + smartTv.canal);
            System.out.println("Volume Atual: " + smartTv.volume);

            smartTv.ligar ();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);


            smartTv.desligar ();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
