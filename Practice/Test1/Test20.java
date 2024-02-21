package Practice.Test1;

public class Test20 {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 2, 3, 1, 3};
        int[] a = {5, 7, 2, 7, 5, 2, 5};
        int n = a.length;
        findNumOccurringOdd(a, n);
    }

    //findNumOccurringOdd
    private static void findNumOccurringOdd(int[] a, int n) {
        int x1 = 0;
        for (int i = 0; i < n; i++) {
            x1 ^= a[i];
        }
        System.out.println(x1);
    }

}
