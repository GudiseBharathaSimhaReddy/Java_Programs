import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        getCharacterFrequency(input);
    }

    public static void getCharacterFrequency(String str) {
        int[] charFrequency = new int[256]; // assuming ASCII characters

        for (char ch : str.toCharArray()) {
            charFrequency[ch]++;
        }

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                System.out.println((char) i + ": " + charFrequency[i]);
            }
        }
    }
}
