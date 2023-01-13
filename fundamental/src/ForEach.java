public class ForEach {
  public static void main(String[] arg) {
    int [] numbers = {
      1, 2, 3, 4, 5
    };
    // TODO: (var number : numbers) similar to (var number = 1; number <= numbers.length; number++)
    for(var number : numbers) {
      System.out.println("Number " + number );
    }
  }
}
