package lab16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class ex16_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<String>();

        System.out.printf("%s%n%s%n", "Enter a series of names.",
                "Enter the end of file indicator (<Ctrl> z) to finalize the entry.");

        while (input.hasNext())
            list.add(input.next());

        input.close();

        DuplicateElimination(list);
    }

    public static void DuplicateElimination(Collection<String> values) {
        Set<String> set = new HashSet<String>(values);

        System.out.print("non-duplicate names: ");

        for (String value : set)
            System.out.printf("%s ", value);
    }
}
