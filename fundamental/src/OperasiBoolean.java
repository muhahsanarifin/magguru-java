public class OperasiBoolean {
  public static void main(String[] args){

    //TODO: Init niTek = (nilaiTeknik)
    var absen = 75;
    var niTek = 75;
    var niTekTwo = 80;
    var niTekThree = 90;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNitek = niTek >= 75 && niTekTwo >= 75 && niTekThree >= 75;

    var lulus = lulusAbsen && lulusNitek;

    System.out.println("Apakah saya lulus ? " + lulus);

  }
}
