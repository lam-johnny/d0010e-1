public class Pass2 {
  public static void main(String[] args) {
    System.out.println(kvadratRekursiv(3));
    växla(148);
  }

  // 2A
  public static int kvadratRekursiv(int n) {
    if (n == 0) {
      return 0;
    } else {
      return kvadratRekursiv(n-1) + 2*(n-1) + 1;
    }
  }

  // 2B
  public static int siffersumma(int n) {
    if (n == 0) {
      return 0;
    } else {
      return siffersumma(Math.floorDiv(n, 10)) + n % 10;
    }
  }

  // 2C
  public static boolean ärPrimtal(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  // 2D
  public static String blanks(int n) {
    if (n == 0) {
      return "";
    } else {
      return blanks(n - 1) + " ";
    }
  }

  // 2E
  public static void växla(int belopp) {
    int rest = belopp;
    int tior = rest / 10; rest = rest % 10;
    int femmor = rest / 5; rest = rest % 5;
    System.out.println(
      "Beloppet " + belopp + "kr växlas till "
      + (tior==0 ? "Inga" : tior) + " tiokron" + (tior==1 ? "a" : "or") + ", "
      + (femmor==0 ? "Inga" : femmor) + " femkron" + (femmor==1 ? "a" : "or") + " och "
      + rest + " enkron" + (rest==1 ? "a" : "or") + "."
    );
  }
}
