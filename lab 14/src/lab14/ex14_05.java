package lab14;
// îl folosim pentru a genera valori aleatorii.
import java.security.SecureRandom;

public class ex14_05 {// begin class
    // main method begins execution of Java application
    public static void main(String[] args) {// begin the main method
        //Construiește un SecureGenerator pentru afisarea valori aleatorii in cazul de de string aleator
        SecureRandom random = new SecureRandom();
//articolele
       String[] article = { "the", "a", "one", "some", "any" };
       //substantiv
        String[] noun = { "boy", "girl", "dog", "town", "car" };
        //verbe
        String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
        //prepozitiile
        String[] prepositon = { "to", "from", "over", "under", "on" };

        String[] sentences = new String[20];

        // creează 20 de propoziții
        for (int i = 0; i < 20; i++) {
            String art = article[random.nextInt(5)];
            // scrie cu majuscule prima literă
            art = art.replaceFirst(art.substring(0, 1), art.substring(0, 1).toUpperCase());

            sentences[i] = String.format("%s %s %s %s %s %s.", art, noun[random.nextInt(5)], verb[random.nextInt(5)],
                    prepositon[random.nextInt(5)], article[random.nextInt(5)], noun[random.nextInt(5)]);
        }

        // afișează propozițiile
        for (int i = 0; i < sentences.length; i++)
            System.out.printf("%d° Frase: %s%n", i + 1, sentences[i]);

    }
}
