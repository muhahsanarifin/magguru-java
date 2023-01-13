public class Method {
  public static void main(String[] arg) {
    String [] talents = {
      "AHSAN", "Accan", "MUH. AHSAN"
    };

    welcomeMsg(talents);
  }

  static void welcomeMsg(String [] talents){

    for(var talent : talents) {
      System.out.println("Welcome " + talent);
    }
  }
}
