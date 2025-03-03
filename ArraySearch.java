import java.util.Scanner;

public class ArraySearch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    int[] array = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.print("Enter the value to search for: ");
    int searchValue = scanner.nextInt();

    boolean found = false;
    for (int i = 0; i < size; i++) {
      if (array[i] == searchValue) {
        System.out.println("Value found at index " + i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Value not found in the array");
    }
  }
}


