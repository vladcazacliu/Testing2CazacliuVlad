package lab14;
import java.util.Scanner;
public class ex14_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in the format 04/25/1955: ");
        String data = scanner.nextLine();
        scanner.close();

        System.out.println(convertFormat(data));

    }

    public static String convertFormat(String data) {
        String[] monthsinEnglish = { "", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        String[] tokens = data.split("/");

        return String.format("%s %s, %s", monthsinEnglish[Integer.parseInt(tokens[0])], tokens[1], tokens[2]);
    }

}
