public class SwitchStatement {
  public static void main(String[] args) {
    var value = 100;

    // TODO: First way
    switch(value) {
      case 100:
      System.out.print("Selamat anda lulus denga nilai " + value +". Sangat memuaskan");
      break;
      case 80:
      System.out.print("Selamat anda lulus denga nilai " + value );
      break;
      case 75:
      System.out.print("Selamat anda lulus denga nilai " + value );
      break;
      default:
      System.out.print("Kamu pasti bisa. Jangan pantang menyerah ya");
    }

    // TODO: Second way
    switch(value) {
      case 100 -> System.out.print("Selamat anda lulus denga nilai " + value +". Sangat memuaskan");
      case 80 -> System.out.print("Selamat anda lulus denga nilai " + value );
      case 75 -> System.out.print("Selamat anda lulus denga nilai " + value );
      default -> {System.out.print("Kamu pasti bisa. Jangan pantang menyerah ya");}
    }
  }
}
