public class ForLoop {
  public static void main(String[] args) {
    for( var counter = 1; counter <= 10; counter++){ //<- counter is gonna stop when value counter equel to 10
      System.out.println("Looping " + counter);
    }

    var counter = 10;
    for(; counter >= 1; counter--){ //<- counter is gonna stop when value counter equel to 1
      System.out.println("Looping " + counter);
    }
  }
}
