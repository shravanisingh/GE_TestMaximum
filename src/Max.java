import java.util.Arrays;

public class Max<T extends Comparable<T>> {

    @SafeVarargs
    private static <T extends Comparable<T>> T testMax(T... values) {

        Arrays.sort(values);
        return values[values.length - 1];
    }
    @SafeVarargs
    public final T testMaximum(T... values) {
        // System.out.println(values.length);
        T value = testMax(values);
        printMax(value);
        return value;

    }
    private void printMax(T max) {
        System.out.println("Max: " + max);
    }

}