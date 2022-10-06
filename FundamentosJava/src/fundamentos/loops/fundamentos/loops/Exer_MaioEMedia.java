package fundamentos.loops;

import java.util.Scanner;

public class Exer_MaioEMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 0;

    int numero;
    int maior = 0;
    int soma = 0;
    double media = 0.0d;
    while (i < 5) {
      System.out.println("Informe um número:");
      numero = scanner.nextInt();

      soma += numero;

      if (numero > maior)
        maior = numero;

      i++;
    }

    media = soma / i;

    System.out.println("O maior número é " + maior);
    System.out.println("A média dos números " + media);
  }

}
