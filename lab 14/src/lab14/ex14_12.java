package lab14;
import java.util.Scanner;
public class ex14_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();
        scanner.close();

        int[] frequency = determineFrequencyLetter(text);

        displayfrequency(frequency);
    }

    public static int[] determineFrequencyLetter(String text) {
        final int TOTAL_LETTERS_ALPHABET = 26;
        int[] frequencyLetters = new int[26];

        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < TOTAL_LETTERS_ALPHABET; j++) {
                if ('A' + j == text.charAt(i))
                    frequencyLetters[j]++;
            }
        }

        return frequencyLetters;
    }

    public static void displayfrequency(int[] frequencyLetters) {
        System.out.printf("%s %10s%n", "Letra", "Frequência");

        for (int i = 0; i < frequencyLetters.length; i++)
            System.out.printf("%3c %9d%n", 'A' + i, frequencyLetters[i]);

    }

}
