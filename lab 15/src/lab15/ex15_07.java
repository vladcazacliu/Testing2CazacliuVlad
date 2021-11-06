package lab15;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class ex15_07 {
    private static final String[] letters = { null, null, "A B C", "D E F", " G H I ", "J K L", "M N O", " P R S",
            "T U V", "W X Y" };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your phone number: ");
        String phoneNumberString = input.nextLine();
        input.close();

        write(separetor(phoneNumberString));

    }


    public static void isNumberValid() {

    }

    public static int[] separetor(String phoneString) {
        int[] phoneNumbers = new int[phoneString.length()];

        for (int i = 0; i < phoneNumbers.length; i++)
            phoneNumbers[i] = Integer.parseInt(phoneString.substring(i, i + 1));

        return phoneNumbers;

    }

    public static void write(int[] phoneNumber) {
        String combinations = "";
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(Files.newOutputStream(Paths.get("combinations.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 0;
        for (int i = 0; i < 3; i++) {
            String[] tokens2 = letters[phoneNumber[0]].split("");
            for (int j = 0; j < 3; j++) {
                String[] tokens3 = letters[phoneNumber[1]].split(" ");
                for (int j2 = 0; j2 < 3; j2++) {
                    String[] tokens4 = letters[phoneNumber[2]].split(" ");
                    for (int k = 0; k < 3; k++) {
                        String[] tokens5 = letters[phoneNumber[3]].split(" ");
                        for (int k2 = 0; k2 < 3; k2++) {
                            String[] tokens6 = letters[phoneNumber[4]].split(" ");
                            for (int l = 0; l < 3; l++) {
                                String[] tokens7 = letters[phoneNumber[5]].split(" ");
                                for (int l2 = 0; l2 < 3; l2++) {
                                    String[] tokens8 = letters[phoneNumber[6]].split(" ");
                                    for (int m = 0; m < 3; m++) {
                                        String[] tokens9 = letters[phoneNumber[6]].split(" ");

                                        combinations = String.format("%d = %s%s%s%s%s%s%s%s%n", ++counter, tokens2[i],
                                                tokens3[j], tokens4[j2], tokens5[k], tokens6[k2], tokens7[l],
                                                tokens8[l2], tokens9[m]);

                                        System.out.print(combinations);
                                        printStream.format("%s", combinations);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

    }

}
