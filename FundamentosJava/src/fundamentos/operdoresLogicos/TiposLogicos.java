package fundamentos.operdoresLogicos;

public class TiposLogicos {
  public static void main(String[] args) {

    int i1 = 10;
    int i2 = 20;
    float f1 = 4.5f;
    float f2 = 4.9f;
    double d1 = 43.8d;
    char c1 = 'x';
    char c2 = 'y';
    String s1 = "Digital";
    String s2 = "Inovation";
    String s3 = "One";
    boolean b1 = true;
    boolean b2 = false;
    long l1 = 7464l;
    long l2 = 7283l;
    long l3 = 2774l;

    System.out.println("i1 == i2 " + (i1 == i2));
    System.out.println("i1 != i2 " + (i1 != i2));
    System.out.println("i1 > i2 " + (i1 > i2));
    System.out.println("i1 <= i2 " + (i1 <= i2));

    System.out.println("f1 == f2 " + (f1 == f2));
    System.out.println("f1 != f2 " + (f1 != f2));
    System.out.println("f1 > f2 " + (f1 > f2));
    System.out.println("f1 >= f2 " + (f1 >= f2));

    System.out.println("c1 == c2 " + (c1 == c2));
    System.out.println("c1 != c2 " + (c1 != c2));
    System.out.println("c1 > c2 " + (c1 > c2));
    System.out.println("c1 >= c2 " + (c1 >= c2));

    System.out.println("s1 == s2 " + (s1 == s2));
    System.out.println("s1 != s3 " + (s1 != s3));
    System.out.println("s1 != s2 " + (s1 != s2));

    // System.out.println(s1 >= s2);
    // System.out.println(s1 < s2);

    System.out.println("c1 == c2 " + (s1 == s2));
    System.out.println("c1 != c2 " + (s1 != s3));

    System.out.println(c1 >= c2);
    System.out.println(c1 < c2);

    System.out.println("i1 > f2 " + (i2 > f2));
    // System.out.println("s1 == c2 " + (s1 == c2));

  }

}
