import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = 1, b = 5, c = 3;
        Max<Integer> t = new Max<>();
        t.testMaximum(a, b, c);
    }
}