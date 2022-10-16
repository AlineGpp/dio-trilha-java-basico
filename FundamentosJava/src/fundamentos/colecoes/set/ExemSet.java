package fundamentos.colecoes.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemSet {
  public static void main(String[] args) {

    Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d)); 
    System.out.println(notas.toString());

    System.out.println("Confira se a nota 5.0 está no conjunto " + notas.contains(5d));

    System.out.println("Confira a menor nota " + Collections.min(notas));

    System.out.println("Confira a maior nota " + Collections.max(notas));

    Iterator<Double> iterator = notas.iterator(); 

    while(iterator.hasNext)
    {
      Double next = iterator.next();
      soma+=next; 
    }

    System.out.println("Soma dos valores " + soma);

    System.out.println("Exiba as notas na ordem em que foram informadas  " );
    Set<Double> notas2 = new LinkedHashSet<>();

    notas.add(7d);
    notas.add(8.5d);
    notas.add(9.3d);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6d);

    System.out.println("Exiba as notas na ordem crescente:");
    Set<Double> notas3 = new TreeSet<>(notas2);

    System.out.println(notas3.toString());


    
    
  }
  
}
