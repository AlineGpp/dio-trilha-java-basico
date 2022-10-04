package fundamentos.metodos;

public class Usuario {

  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    System.out.println("A Tv está ligada ? " + smartTv.ligada);
    System.out.println("Canal: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.ligar();

    System.out.println("A Tv está ligada ? " + smartTv.ligada);

    smartTv.desligar();

    System.out.println("A Tv está ligada ? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume: " + smartTv.volume);

    smartTv.irParaCanal(25);

    System.out.println("Canal: " + smartTv.canal);

    smartTv.aumentarCanal();

    System.out.println("Canal: " + smartTv.canal);

    smartTv.diminuirCanal();

    System.out.println("Canal: " + smartTv.canal);

  }

}
