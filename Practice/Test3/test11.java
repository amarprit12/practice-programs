package Practice.Test3;

import java.util.HashSet;

public class test11 {
    public static void main(String[] args) {
        int[] a1 = {11, 1, 13, 21, 3, 7};
        int[] a2 = {11, 3, 7, 1};
        int m = a1.length;
        int n = a2.length;
        boolean result = findArraySubset(a1, a2, m, n);
        if (result) {
            System.out.println("Array 2 is subset of another array");
        } else {
            System.out.println("Array 2 is not subset of another array");
        }
    }

    private static boolean findArraySubset(int[] a1, int[] a2, int m, int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            if (!hashSet.contains(a1[i])) {
                hashSet.add(a1[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(a2[i])) {
                return false;
            }
        }
        return true;
    }
}
