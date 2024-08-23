package Practice.Test9;

public class t5 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 3, 1, 3};
        int result = findNoOccurringOdd(a, a.length);
        System.out.println(result);
    }

    private static int findNoOccurringOdd(int[] a, int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = x ^ a[i];
        }
        return x;
    }
}
