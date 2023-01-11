public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    int age = 20;
    Integer ageObject = age;

    int ageAgain = ageObject;

    System.out.println(ageAgain);

    // TODO: Second way.
    short iniShort = ageObject.shortValue();

    System.out.println(iniShort);
  }
}
