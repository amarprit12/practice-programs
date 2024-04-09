package Practice.Test6;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int a[] = {2, 3, 7, 6, 8, -1, -10, 15};
        int n = a.length;
        int res = findSmallestPositive(a, n);
        System.out.println(res);
    }

    private static int findSmallestPositive(int[] a, int n) {
        Arrays.sort(a);
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == res) {
                res++;
            }
        }
        return res;

    }
}
