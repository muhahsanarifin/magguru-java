public class Array {
  public static void main(String[] args) {
    // TODO: First way

    // String [] arrayString;
    // arrayString = new String[4];
    // arrayString[0] = "Kami";
    // arrayString[1] = "Kamu";
    // arrayString[2] = "Dia";
    // arrayString[3] = "Saya";

    // System.out.println(arrayString[0] + ", " + arrayString[1] + ", " + arrayString[2] + ", " + arrayString[3]);


    // TODO: Second way
    String [] wordString = {
      "Kami", "Kamu", "Dia", "Saya"
    };

    System.out.println("Result: " + wordString[1] + ", " + wordString[3]);

    int [] arrayInt = new int[] {
      1 , 2, 3, 4, 5
    };

    System.out.println("Result: " + arrayInt[1]);

    // TODO: Third way
    // [][] <- Init 2 arrays
    String[][] members = {
      {"MUH.", "AHSAN"},
      {"Accan"},
      {"AHSAN"}
    };

  System.out.println("Result: " + members[0][1]);
  }
}
