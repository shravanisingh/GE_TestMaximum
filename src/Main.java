import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Max t = new Max(sc);
        System.out.println("The Maximum number is: " + t.getMax());
    }
}
