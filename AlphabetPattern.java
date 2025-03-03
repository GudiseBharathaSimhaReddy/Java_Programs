public class AlphabetPattern {
  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0) {
          System.out.print((char) ('A' + i - 1) + " ");
        } else {
          System.out.print("A ");
        }
      }
      System.out.println();
    }
  }
}
