package Practice.Test9;

import java.util.HashSet;

public class t9 {
    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 7, 1};
        boolean result = findArraySubSet(a1, a2, a1.length, a2.length);
        if (result) {
            System.out.println("Array subset of another array");
        } else {
            System.out.println("not subset");
        }

    }

    private static boolean findArraySubSet(int[] a1, int[] a2, int m, int n) {
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
