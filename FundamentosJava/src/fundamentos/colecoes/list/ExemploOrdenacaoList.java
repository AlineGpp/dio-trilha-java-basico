package fundamentos.colecoes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
  public static void main(String[] args) {

    List<Gato> meusGatos = new ArrayList<>() {
      {
        add(new Gato("John", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("John", 12, "amarelo"));
      }
    };

    System.out.println(meusGatos);

    System.out.println("Ordem aleatótia");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("Ordem natural");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    System.out.println("Ordem por idade");
    // Collections.sort(meusGatos, new ComparatorIdade());
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);
  }

}

class Gato implements Comparable<Gato> {
  private String nome;
  private String cor;
  private Integer idade;

  Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.cor = cor;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "{" + "nome= " + nome + '\'' +
        ", " + "idade= " + idade +
        ", " + "cor= " + cor + '\'' + '}';
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }

}

class ComparatorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato gato1, Gato gato2) {

    return Integer.compare(gato1.getIdade(), gato2.getIdade());
  }

}