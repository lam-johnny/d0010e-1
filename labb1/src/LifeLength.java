import java.util.Scanner;

public class LifeLength {
  public static void main(String[] args) {

    // Tasks 1/2 use input
    Scanner input = new Scanner(System.in);

    int n = 6;

    switch (n) {
      case 1:
        task1(input.nextInt());
        break;

      case 2:
        task2(input.nextInt());
        break;

      case 3:
        task3();
        break;

      case 4:
        task4();
        break;

      case 6:
        task6();
        break;

      default:
        System.out.println("n is not 1, 2, 3, 4, or 6");
    }

    //
    // Task 7:
    // If someone was to run the program with an input that has infinite life length,
    // the program would run forever, in the case of the iterative version
    // (the while loop would never reach == 1 and therefore not terminate)
    // and would reach Javas maximum recursion depth and crash in the case of the recursive solution.
    //

    input.close();
  }

  public static void task1(int input) {
    // Task 1:
    System.out.println(f1(input));
  }

  public static void task2(int input) {
    // Task 2:
    int n = input;
    System.out.println("f1="+f1(n)+" f2="+f2(n)+" f4="+f4(n)+" f8="+f8(n)+" f16="+f16(n)+" f32="+f32(n));
  }

  public static void task3() {
    // Task 3:
    System.out.println(iterateF(3, 5));
    System.out.println(iterateF(42, 3));
    System.out.println(iterateF(1, 3));
  }

  public static void task4() {
    // Task 4:
    for (int i = 1; i <= 15; i++) {
      System.out.println(intsToString(i, iterLifeLength(i)));
    }
  }

  public static void task6() {
    // Task 6:
    for (int i = 1; i <= 15; i++) {
      System.out.println("The recursively calculated life length of "+i+" is "+recLifeLength(i)+".");
    }
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
    int n = 1;
    while (a != 1) {
      a = f1(a);
      n++;
    }
    return n;
  }

  public static String intsToString(int n, int ll) {
    return "The life length of " + n + " is " + ll + ".";
  }

  // This works because the life lenght of x is the same as the life length of f1(x) (the next step towards 1) + 1.
  // l(x) = l(f1(x)) + 1
  public static int recLifeLength(int a0) {
    if (a0 == 1) {
      return 1;
    }
    else {
      return 1 + recLifeLength(f1(a0));
    }
  }
}
