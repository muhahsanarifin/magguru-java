public class WhileLoop {
  public static void main(String[] args) {
    var counter = 5;
    while (counter <= 10) {
      System.out.println("Looping " + counter);

      counter ++; //<- similar counter += 1;
    }
  }
}
