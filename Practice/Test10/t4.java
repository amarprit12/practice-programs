package Practice.Test10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class t4 {
    public static void main(String[] args) {
        int a[] = {-3, -1, 0, 0, 0, 3, 3};
        int result = removeDuplicates(a, a.length);
        System.out.println(result);
    }

    private static int removeDuplicates(int[] a, int n) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(a[i]);
        }
        int [] result = new int[hashSet.size()];
        int index = 0;
        for (int element : hashSet) {
            result[index++] = element;
        }
        for(int i =0;i<hashSet.size();i++){
            System.out.print(result[i]+ " ");
        }
        return hashSet.size();
    }
}
