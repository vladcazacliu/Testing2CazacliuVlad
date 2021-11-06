package lab16;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class ex16_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String[] tokens = scanner.nextLine().split(" ");
        scanner.close();

        Set<String> set = new TreeSet<String>(Arrays.asList(tokens));

        for (String word : set)
            System.out.printf("%s ", word);

    }

}
