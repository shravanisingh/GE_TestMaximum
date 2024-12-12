import java.util.Scanner;

public class Max<T extends Comparable<T>> {

    private T dt1, dt2, dt3;

    public Max(T a, T b, T c) {
        this.dt1 = a;
        this.dt2 = b;
        this.dt3 = c;
    }

    public T getMax() {
        T max = dt1.compareTo(dt2) > 0 ? dt1 : dt2;
        max = max.compareTo(dt3) > 0 ? max : dt3;
        return max;
    }
}