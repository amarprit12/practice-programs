package Practice.Test2;

import java.util.HashMap;
import java.util.Map;

public class test9 {
    public static void main(String[] args) {
        int[] a = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(a, a.length);

    }

    private static void findMissingAndRepeating(int[] a, int n) {
        Map<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.get(a[i]) == null) {
                hashMap.put(a[i], true);
            } else {
                System.out.println("Repeating: " + a[i]);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (hashMap.get(i) == null) {
                System.out.println("Missing : " + i);
            }
        }
    }
}
