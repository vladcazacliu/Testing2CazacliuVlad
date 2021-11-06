package lab16;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
public class ex16_17 {// begin class
    // main method begins execution of Java application
    public static void main(String[] args) {// begin the main method
        // cream SecureRandom generam valori aleatoii
        SecureRandom random = new SecureRandom();
//se creaza LinkedList si manipuleaza cu valorile
        List<Integer> linkedList = new LinkedList<Integer>();
//adaugam numere random
        for (int i = 0; i < 25; i++)
            linkedList.add(random.nextInt(101));
//sortarea
        linkedList.sort(null);

        double average = 0;
        for (int number : linkedList)
            average += number;

        //afisam suma media
        System.out.println(linkedList);
        System.out.printf("Sum: %,.0f%nMedia: %,.2f", average, average / linkedList.size());
    }
}
