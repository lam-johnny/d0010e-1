public class Saw {
  public static void main(String[] args) {
    // Prints "Hello World!" to the terminal window.
    sawtooth(3, 2);
  }

  // Prints a triangle shape to the terminal window.
  public static void triangle(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j <= i-1; j++) {
        System.out.print("*");
      }
      System.out.print("-");
      System.out.println();
    }
  }

  public static void sawtooth(int a, int b) {
    // Loops triangle(a) times, printing a sawtooth shape.
    for (int i = 0; i < b; i++) {
      triangle(a);
    }
  }
}
