public class Concatenate {
  public static void main(String[] args) {
    String[] c = {"berg", "o", "ch", "dal", "ban", "a"};
    System.out.println(concatenate(c));
  }

  // Concatenate array of strings
  public static String concatenate(String[] strings) {
    String result = "";
    for (int i = 0; i < strings.length; i++) {
      result += strings[i];
      System.out.println(strings[i] + ", " + strings[i].length());
    }
    return result;
  }
}
