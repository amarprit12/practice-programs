package Practice.Test3;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int a[] = {30, 25, 40};
        int b[] = {30, 25, 40};
        checkArraysEqual(a, b);
    }

    private static void checkArraysEqual(int[] a, int[] b) {
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
}
