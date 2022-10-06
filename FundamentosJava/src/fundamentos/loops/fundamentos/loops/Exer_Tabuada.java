package fundamentos.loops;

import java.util.Scanner;

public class Exer_Tabuada {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número");
    int numero = scanner.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.println(i + "X" + numero + "=" + (i * numero));
    }
  }

}
