package fundamentos.loops;

import java.util.Scanner;

public class Exer_ParOuImpar {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int quantidadeNumeros;
    int cont = 0;
    int numero;
    int qtdPares = 0;
    int qtdImpares = 0;

    System.out.println("Informe a quantidade de números:");
    quantidadeNumeros = scanner.nextInt();

    do {
      System.out.println("Informe um número:");
      numero = scanner.nextInt();
      if (numero % 2 == 0)
        qtdPares++;
      else
        qtdImpares++;

      cont++;
    } while (cont < quantidadeNumeros);

    System.out.println("Quantidade de pares " + qtdPares);
    System.out.println("Quantidade de impares " + qtdImpares);

  }

}
