public class DoWhileLoop {
  public static void main(String[] arg) {
    var counter = 5;
    do {
      System.out.println("Looping " + counter);
      counter --; // <- Decrement
    } while (counter >= 1);
  }
}
