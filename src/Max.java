import java.util.Scanner;

public class Max {

    private Integer int1, int2, int3;
    private Float float1, float2, float3;

    public void inputMaxInt(Scanner sc) {
        System.out.println("Enter the First Number:");
        this.int1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        this.int2 = sc.nextInt();
        System.out.println("Enter the Third Number:");
        this.int3 = sc.nextInt();
    }

    public void inputMaxFloat(Scanner sc) {
        System.out.println("Enter the First float Number:");
        this.float1 = sc.nextFloat();
        System.out.println("Enter the Second float Number:");
        this.float2 = sc.nextFloat();
        System.out.println("Enter the Third float Number:");
        this.float3 = sc.nextFloat();
    }

    public Integer getMaxInteger() {
        Integer max = (int1.compareTo(int2) >= 0) ? int1 : int2;
        max = (max.compareTo(int3) >= 0) ? max : int3;
        return max;
    }

    public Float getMaxFloat() {
        Float max = (float1.compareTo(float2) >= 0) ? float1 : float2;
        max = (max.compareTo(float3) >= 0) ? max : float3;
        return max;
    }
}