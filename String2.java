package javaprograms;
import java.util.Scanner;
public class String2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        scanner.close();

        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }

        System.out.println("Number of vowels: " + count);
    }
}