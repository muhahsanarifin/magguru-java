public class OperasiMatematika {
  public static void main(String[] args) {
    int a = 100;
    int b = 10;

    System.out.println("Result: " + (a + b));
    System.out.println("Result: " + (a - b));
    System.out.println("Result: " + (a * b));
    System.out.println("Result: " + (a / b));
    System.out.println("Result: " + (a % b));

    // TODO: Second way
    int value = 1000;
    value += 1000; //<= like 1000 + 1000
    System.out.println("Result: " + value);

    //TODO: Third way
    int d = 100;
    d++; // <- like Increment in JavaScript
    System.out.println(d);

    d--;
    System.out.println(d); // <- like Decrement in Javascript

  }
}
