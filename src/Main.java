import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type of values you want to enter:");
        System.out.println("1. Integer");
        System.out.println("2. Float");
        System.out.println("3. String");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                List<Integer> integers = getInputValues(sc, Integer.class);
                Max<Integer> maxInteger = new Max<>();
                maxInteger.testMaximum(integers.toArray(new Integer[0]));  // Convert List to array for the Max class
                break;
            case 2:
                List<Float> floats = getInputValues(sc, Float.class);
                Max<Float> maxFloat = new Max<>();
                maxFloat.testMaximum(floats.toArray(new Float[0]));  // Convert List to array for the Max class
                break;
            case 3:
                List<String> strings = getInputValues(sc, String.class);
                Max<String> maxString = new Max<>();
                maxString.testMaximum(strings.toArray(new String[0]));  // Convert List to array for the Max class
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
        }
    }
    private static <T> List<T> getInputValues(Scanner sc, Class<T> type) {
        List<T> values = new ArrayList<>();
        System.out.println("Enter values of type " + type.getSimpleName() + ". Type 'done' when you're finished.");

        while (true) {
            System.out.print("Enter a " + type.getSimpleName() + ": ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                T value = parseValue(input, type);
                values.add(value);  // Add the parsed value to the list
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a valid " + type.getSimpleName() + ".");
            }
        }
        return values;
    }
    private static <T> T parseValue(String input, Class<T> type) {
        if (type == Integer.class) {
            return type.cast(Integer.parseInt(input));
        } else if (type == Float.class) {
            return type.cast(Float.parseFloat(input));
        } else if (type == String.class) {
            return type.cast(input);
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }
}