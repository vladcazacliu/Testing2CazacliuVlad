package lab14;
import java.util.Scanner;
public class ex14_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();
        scanner.close();

        String[] tokens = text.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].lastIndexOf("ED") != -1)
                System.out.println(tokens[i]);
        }

    }

}
