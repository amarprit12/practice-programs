package Practice.Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test8 {
    public static void main(String[] args) {
        // find duplicates
        int a[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
//        findDuplicates(a, a.length);
        findDuplicates1(a, a.length);
    }

    private static void findDuplicates(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPresent = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    if (list.contains(a[i])) {
                        break;
                    } else {
                        list.add(a[i]);
                        isPresent = true;
                    }
                }
            }
        }
        if (isPresent) {
            System.out.println(list);
        } else {
            System.out.println("No duplicate present");
        }
    }

    private static void findDuplicates1(int a[], int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(a[i])) {
                count = hashMap.get(a[i]);
                hashMap.put(a[i], count + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                dup = true;
            }
        }
        if (!dup) {
            System.out.println("-1");
        }
    }
}
