public class Pass3 {
  
  public static void main(String[] args) {
    System.out.println(beautify("trots", 't'));
  }

  // 3B
  public static String beautify(String s, char bad) {
    String newStr = "";
    for (char c : s.toCharArray()) {
      if (c != bad) {
        newStr += c;
      }
    }
    return newStr;
  }

}
