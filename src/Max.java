import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max<T extends Comparable<T>> {
    @SafeVarargs
    public final T testMaximum(T... values) {
        // Handle case when no values are provided
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Cannot determine the max of empty values");
        }

        T value = testMax(values);
        System.out.println("Max: " + value);
        return value;
    }
    private T testMax(T... values) {
        List<T> list = Arrays.asList(values);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}