package fundamentos.metodos;

public class Main {
  public static void main(String[] args) {
    System.out.println("Calculadora");

    Calculadora.soma(12, 3);
    Calculadora.subtracao(20, 4);
    Calculadora.multiplicao(3, 9);
    Calculadora.divisao(18, 9);

    System.out.println("Emprestimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());

    Emprestimo.calcular(2000, Emprestimo.getTresParcelas());

    Emprestimo.calcular(9000, 5);

  }
}
