package fundamentos.loops;

import java.util.Random;

public class Exer_ArrayMultidimencional {

  public static void main(String[] args) {
    Random random = new Random();

    int[][] Matriz = new int[4][4];

    for (int i = 0; i < Matriz.length; i++) {
      for (int j = 0; j < Matriz[i].length; j++) {
        Matriz[i][j] = random.nextInt(9);
      }
    }

    for (int[] linha : Matriz) {
      for (int coluna : linha) {
        System.out.print(coluna + " ");

      }

      System.out.println();
    }

  }

}
