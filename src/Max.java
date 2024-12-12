import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max<T extends Comparable<T>> {

    // Method to find the maximum value by sorting the array
    @SafeVarargs
    public final T testMaximum(T... values) {
        // Handle case when no values are provided
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Cannot determine the max of empty values");
        }

        T value = testMax(values);  // Get the max value from the sorted list
        printMax(value);  // Print the max value
        return value;
    }

    // Method to sort and return the maximum value
    private T testMax(T... values) {
        // Convert array to list for sorting
        List<T> list = Arrays.asList(values);
        Collections.sort(list);  // Sorting the list in natural order
        return list.get(list.size() - 1);  // Return the last element (maximum)
    }

    // Method to print the maximum value
    private void printMax(T max) {
        System.out.println("Max: " + max);  // Print the max value
    }
}