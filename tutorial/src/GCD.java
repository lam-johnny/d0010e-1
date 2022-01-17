public class GCD {
  // main method
  public static void main(String[] args) { 
    gcd(143, 13);
  }

    public static void gcd(int a, int b) {
      int temp;
      do {
        temp = a % b;
        a = b;
        b = temp;
      } while (temp != 0);
      
      System.out.println("GCD is " + a);
    }
}
