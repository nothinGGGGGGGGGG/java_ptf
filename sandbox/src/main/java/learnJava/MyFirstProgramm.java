package learnJava;

public class MyFirstProgramm {
  public static void main(String[] args) {
    Cats g = new Cats("Kisa", "1992");
    System.out.println(g.animals());

    Dogs d = new Dogs ( 1990);
    System.out.println(d.animals());

  }

}
