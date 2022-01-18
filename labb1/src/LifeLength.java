import java.util.Scanner;

public class LifeLength {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Task 1:
    // System.out.println(f1(input.nextInt()));

    // Task 2:
    // int n = input.nextInt();
    // System.out.println("f1="+f1(n)+" f2="+f2(n)+" f4="+f4(n)+" f8="+f8(n)+" f16="+f16(n)+" f32="+f32(n));

    // Task 3:
    System.out.println(iterateF(3, 5));
    System.out.println(iterateF(42, 3));
    System.out.println(iterateF(1, 3));

    // Task 4:

  }

  public static int f1(int a0) {
    if (a0 == 1) {
      return 1;
    }
    else if (a0 % 2 == 0) {
      return a0 / 2;
    }
    else {
      return 3 * a0 + 1;
    }
  }

  public static int f2(int a0) {
    return f1(f1(a0));
  }

  public static int f4(int a0) {
    return f2(f2(a0));
  }

  public static int f8(int a0) {
    return f4(f4(a0));
  }

  public static int f16(int a0) {
    return f8(f8(a0));
  }

  public static int f32(int a0) {
    return f16(f16(a0));
  }

  public static int iterateF(int a0, int n) {
    int a = a0;
    for (int i=0; i<n; i++) {
      a = f1(a);
    }
    return a;
  }

  public static int iterLifeLength(int a0) {
    int a = a0;
    int n = 0;
    while (a != 1) {
      a = f1(a);
      n++;
    }
    return n;
  }
}
