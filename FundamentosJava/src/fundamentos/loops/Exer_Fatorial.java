package fundamentos.loops;

import java.util.Scanner;

public class Exer_Fatorial {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o fatorial que deseja saber ");
    int fatorial = scanner.nextInt();
    int resultado = 1;

    for (int i = fatorial; i > 0; i--) {
      resultado *= i;
    }
    System.out.println("Fatorial de " + fatorial + " eh " + resultado);

  }

}
