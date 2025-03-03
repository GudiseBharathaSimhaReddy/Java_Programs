import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to check: ");
        String substring = scanner.nextLine();

        if (isSubstring(mainString, substring)) {
            System.out.println(substring + " is a substring of " + mainString);
        } else {
            System.out.println(substring + " is not a substring of " + mainString);
        }
    }

    public static boolean isSubstring(String mainString, String substring) {
        return mainString.contains(substring);
    }
}


