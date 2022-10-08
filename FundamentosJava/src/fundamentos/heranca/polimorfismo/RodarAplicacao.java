package fundamentos.heranca.polimorfismo;

public class RodarAplicacao {
  public static void main(String[] args) {

    ClasseMae[] classes = new ClasseMae[] {
        new ClasseFilha(), new ClasseFilha2(), new ClasseMae() };

    for (ClasseMae classeMae : classes) {
      classeMae.metodo1();

    }

    System.out.println("");

    for (ClasseMae classeMae : classes) {

      classeMae.metodo2();

    }

    System.out.println("");

    ClasseFilha2 classeFilha2 = new ClasseFilha2();
    classeFilha2.metodo2();

  }

}
