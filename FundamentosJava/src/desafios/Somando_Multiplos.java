package desafios;

import java.util.Scanner;

public class Somando_Multiplos {

  public static void main(String[] args) {
    int A, N;

    Scanner input = new Scanner(System.in);
    A = input.nextInt();
    N = input.nextInt();

    // TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

    int soma = 0;

    int i = 0;

    while (i <= N) {
      if (i % A == 0) {
        soma += i;
      }

      i++;
    }

    System.out.println(soma);

    input.close();
  }
}
