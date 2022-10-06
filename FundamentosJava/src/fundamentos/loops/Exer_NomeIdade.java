package fundamentos.loops;

import java.util.Scanner;

import javax.lang.model.element.Name;

public class Exer_NomeIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome01 = "";
    int idade01;

    String nome02 = "";
    int idade02;

    while (!nome01.equals("0")) {
      System.out.println("Nome01: ");
      nome01 = scanner.next();
      System.out.println("Idade01:");
      idade01 = scanner.nextInt();
    }

    while (true) {
      System.out.println("Nome02: ");
      nome02 = scanner.next();
      if (nome02.equals("0"))
        break;
      System.out.println("Idade02:");
      idade02 = scanner.nextInt();
    }

  }

}
