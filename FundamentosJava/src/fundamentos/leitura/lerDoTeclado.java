package fundamentos.leitura;

import java.net.Inet4Address;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.GroupLayout.Alignment;

public class lerDoTeclado {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Informe o seu nome");
    String nome = scanner.next();

    System.out.println("Informe sua idade");
    int idade = scanner.nextInt();

    System.out.println("informe sua altura");
    double altura = scanner.nextDouble();

    System.out.println("Olá, " + nome + " sua idade é " +
        idade + " e sua altura é " + altura);
  }

}
