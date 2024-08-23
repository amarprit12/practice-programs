package Practice.Test10;

import java.util.HashSet;

public class t16 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 4};
        int n = a.length;
        int size = removeDuplicates(a, n);
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int removeDuplicates(int[] a, int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(a[i]);
        }
        int index = 0;
        for (int element : hashSet) {
            a[index++] = element;
        }
        return hashSet.size();
    }
}
