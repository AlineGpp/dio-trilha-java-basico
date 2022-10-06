package fundamentos.loops;

public class Exer_Array {
  public static void main(String[] args) {
    int[] vetor = { 0, 3, 4, -60, 3, 45, 12 };

    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");
    }
  }

}
