package Practice.Test1;

public class Test16 {
    public static void main(String[] args) {
//        int[] a = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        int[] a = {12, 1234, 45, 67, 1};
        findMinimumElement(a, a.length);
        findMaximumElement(a, a.length);
    }

    private static void findMinimumElement(int[] a, int n) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        System.out.println("Minimum value is : " + minimum);
    }


    private static void findMaximumElement(int[] a, int n) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        System.out.println("Maximum value is : " + maximum);
    }
}
