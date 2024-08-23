package Practice.Test9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class t11 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int count = countTriplets(a, a.length);
        System.out.println(count);
    }

    private static int countTriplets(int[] a, int n) {
        int count = 0;
        Arrays.sort(a);
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : a) {
            hashSet.add(num);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hashSet.contains(a[i] + a[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
