package fundamentos.metodos;

public class SmartTv {

  int canal = 1;
  boolean ligada = false;
  int volume = 22;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para " + volume);
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void irParaCanal(int novoCanal) {
    canal = novoCanal;
  }

}
