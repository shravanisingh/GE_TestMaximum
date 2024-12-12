import java.util.Scanner;

public class Max {

    private Integer a, b, c;

    public Max(Scanner sc) {
        System.out.println("Enter the First Number:");
        this.a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        this.b = sc.nextInt();
        System.out.println("Enter the Third Number:");
        this.c = sc.nextInt();
    }

    public Integer getMax() {
        Integer max = (a.compareTo(b) >= 0) ? a : b;
        max = (max.compareTo(c) >= 0) ? max : c;
        return max;
    }
}