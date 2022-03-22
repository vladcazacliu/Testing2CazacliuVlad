import java.util.Scanner;
public class gitClass {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);


        int num1;
        int num2;

        int difference;
        int quotient;

        System.out.print("Dati 1 numar: ");
        num1 = input.nextInt();//citim primul integer

        System.out.print("Dati al 2 numar: ");
        num2 = input.nextInt();


        difference = num1 - num2;
        quotient = num1 / num2;


        System.out.printf("Difference is %d\n", +difference);
        System.out.printf("Quotient is %d\n", +quotient);

    }
}

