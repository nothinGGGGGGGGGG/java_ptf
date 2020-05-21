package learnJava;

public class Cats {
  String name;
  String year;

 public Cats(String name, String year) {
   this.name = name;
   this.year = year;
 }

 public String animals() {
   return this.name + " " + this.year;
 }
}
