public class Raise {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 15; i++) {
      System.out.println("i="+i+" \t1,5^"+i+"="+recRaiseHalf(1.5, i)+" \trecRaiseOne calls: "+recRaiseOneCount(i)+" \trecRaiseHalf calls: "+recRaiseHalfCount(i));
    }

  }

  public static double recRaiseOne(double x, int k) {
    if (k == 0) {
      return 1d;
    }
    else {
      return x * recRaiseOne(x, k-1);
    }
  }

  public static double recRaiseHalf(double x, int k) {
    if (k == 0) {
      return 1d;
    }
    else {
      double raiseHalf = recRaiseHalf(x, k/2);
      if (k % 2 == 0) {
        return raiseHalf * raiseHalf;
      }
      else {
        return x * raiseHalf * raiseHalf;
      }
    }
  }

  // Counts recursive calls
  public static int recRaiseOneCount(int k) {
    if (k == 0) {
      return 0;
    }
    else {
      return 1 + recRaiseOneCount(k-1);
    }
  }

  public static int recRaiseHalfCount(int k) {
    if (k == 0) {
      return 0;
    }
    else {;
      return 1 + recRaiseHalfCount(k/2);
    }
  }
}

//
// 1.
// The size of x is mostly insignificant, as it takes the computer only one operation to perform a multiplication no matter the number size,
// whereas the size of k affects the amount of times the multiplication needs to be performed, therefore increasing the running time the most.
//
// 2.
// Graph: https://cdn.discordapp.com/attachments/489085929726935041/933761693916467210/unknown.png
//
//
//
//
//
