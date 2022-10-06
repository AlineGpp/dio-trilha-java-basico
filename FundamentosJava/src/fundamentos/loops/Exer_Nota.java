package fundamentos.loops;

import java.util.Scanner;

public class Exer_Nota {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int nota;

    do {
      System.out.println("Informe uma nota de 0 a 10");
      nota = scanner.nextInt();
    } while (nota > 10 || nota < 0);

    System.out.println("A nota informada foi:" + nota);

  }

}
