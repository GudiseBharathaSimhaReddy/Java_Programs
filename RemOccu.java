import java.util.Scanner;

public class RemOccu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char character = scanner.next().charAt(0);

        String result = removeCharacter(input, character);

        System.out.println("Result: " + result);
    }

    public static String removeCharacter(String str, char character) {
        return str.replace(String.valueOf(character), "");
    }
}

