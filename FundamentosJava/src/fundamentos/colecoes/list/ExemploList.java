package fundamentos.colecoes.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

  public static void main(String[] args) {
    /* Dada uma lista com 7 notas de um aluno {7.0, 8.5, 9.3,5.0,7.0,0.0,3.6} */

    /* Inicializar um List */

    // List notas = new ArrayList<>();
    // System.out.println("List notas " + notas);

    // List<Double> notas = new ArrayList<Double>();
    // System.out.println("List<Double> notas "+ notas);

    // ArrayList<Double> notas = new ArrayList<>();
    // System.out.println("ArrayList<Double> notas "+ notas);

    // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d,
    // 0d, 3.6d));
    // System.out.println("List<Double> notas = new (ArrayList<>(Arrays.asList()) "
    // +
    // notas);

    // List<Double> notas = Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d);
    // notas.add(10d); não permite retirar nem adicionar
    // System.out.println(" List<Double> notas = Arrays.asList() " + notas);

    // List<Double> notas = List.of(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d);
    // também não permite add() e remove();
    // System.out.println("List<Double> notas = List.of() " + notas);

    System.out.println("Crie uma lista e adicione as 7 notas\n");

    List<Double> notas = new ArrayList<Double>();
    notas.add(7d);
    notas.add(8.5d);
    notas.add(9.3d);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6d);

    System.out.println(notas.toString());

    System.out.println("Exiba a posicao da nota 5: " + notas.indexOf(5d));

    System.out.println("Adicione o elemento 8 na posicao 4");
    notas.add(4, 8d);
    System.out.println(notas);

    System.out.println("Substitua a nota 5.0 pela 6.0");
    notas.set(notas.indexOf(5d), 6d);
    System.out.println(notas);

    System.out.println("Verificar se a nota 5 esta na lista: ");

    System.out.println(notas.contains(5d));

    System.out.println("Exiba na ordem de inserção:");

    for (Double nota : notas)
      System.out.println(nota);

    System.out.println("Exiba a terceira nota adicionada:" + notas.get(2));
    System.out.println(notas.toString());

    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    System.out.println("Exiba a maioor nota: " + Collections.max(notas));

    System.out.println("Exiba a soma dos valores: ");
    Iterator<Double> iterator = notas.iterator();

    Double soma = 0d;

    while (iterator.hasNext()) {
      Double next = iterator.next();

      soma += next;
    }

    System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println("Exiba a media dos valores: " + soma / notas.size());

    System.out.println("Remova a nota: ");
    notas.remove(0d);

    System.out.println("Remova a posicao: ");
    notas.remove(0);

    System.out.println(notas.toString());

    System.out.println("Remova as notas menores do que 7");

    Iterator<Double> iterator1 = notas.iterator();

    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }

    System.out.println(notas);

    System.out.println("Apague toda a lista");
    notas.clear();

    System.out.println(notas);

    System.out.println("Verifique se a lista está vazia " + notas.isEmpty());

  }

}
