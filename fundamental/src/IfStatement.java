public class IfStatement {
  public static void main(String[] args) {
    var minScore = 75; //<- Minimal nilai yang harus dicapai

    var personalScore = 80;
    var teamScore = 90;

    var mainScore = (personalScore + teamScore) / 2;

    if (personalScore >= minScore && teamScore >= minScore) {
      System.out.print("Selamat anda lulus fazztrack dengan capaian nilai " + (mainScore));
    } else {
      System.out.print("Tetap semangat dan terus berjuan ya");
    }
  }
}
