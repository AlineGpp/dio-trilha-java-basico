package fundamentos.estruturaBase;

public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();

    carro1.setCor("Rosa");
    carro1.setModelo("BMW");
    carro1.setCapacidadeTanque(100);

    System.out.println(carro1.getCor());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCapacidadeTanque());

    System.out.println("O valor par encher o tanque é " + carro1.valorTotalTanque(20));

    Carro carro2 = new Carro("Fuccia", "Lamborghini", 150);

    System.out.println(carro2.getCor());
    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(carro2.valorTotalTanque(54));

  }

}
