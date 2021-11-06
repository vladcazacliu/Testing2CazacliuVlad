package lab20;
import java.util.Arrays;
public class ex20_04 {
    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallest = i;

            for (int index = i + 1; index < data.length; index++)
                if (data[index].compareTo(data[smallest]) < 0)
                    smallest = index;

            swap(data, i, smallest);
        }
    }

    private static <T> void swap(T[] data, int first, int second) {
        T temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    public static void main(String[] args) {
        Integer[] integerData = { 5, 4, 1, 3, 2 };

        System.out.printf("Unsorted integer array:%n%s%n%n", Arrays.toString(integerData));
        selectionSort(integerData);
        System.out.printf("Sorted array:%n%s%n%n%n", Arrays.toString(integerData));

        Float[] floatData = { 50.1f, 10.1f, 20.1f, 40.1f };

        System.out.printf("Unsorted float array:%n%s%n%n", Arrays.toString(floatData));
        selectionSort(floatData);
        System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(floatData));
    }
}
