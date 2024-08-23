package Practice.Test9;

import java.util.HashMap;

public class t17 {
    public static void main(String[] args) {
        int a[] = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        int no = firstElementOccurringKTime(a, a.length, k);
        System.out.println(no);
    }

    private static int firstElementOccurringKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(a[i])) {
                int count = hashMap.get(a[i]);
                hashMap.put(a[i], count + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (hashMap.get(a[i]) == k) {
                return a[i];
            }
        }
        return -1;
    }
}
