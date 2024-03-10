package Practice.Test3;

import java.util.HashMap;

public class test10 {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 1, 7, 2, 4, 2};
        int n = a.length;
        removeDuplicates(a, n);
//        int result = Math.max(-6, -18);
//        System.out.println(result);
//
//        int result1 = Math.min(-6, -18);
//        System.out.println(result1);
    }

    private static void removeDuplicates(int[] a, int n) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.get(a[i]) == null) {
                System.out.print(a[i] + " ");
            }
            hashMap.put(a[i], true);
        }
    }

}
