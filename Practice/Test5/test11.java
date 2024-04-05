package Practice.Test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test11 {
    public static void main(String[] args) {
//        int a[] = {2, 3, 1, 2, 3};
        int a[] = {0, 3, 1, 2};
        int n = a.length;
        ArrayList<Integer> arrayList = findDuplicates(a, n);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> findDuplicates(int a[], int n) {
        ArrayList<Integer> arrayList = new ArrayList();
        boolean duplicate = false;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(a[i])) {
                int count = hashMap.get(a[i]);
                hashMap.put(a[i], count + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 1) {
//                System.out.println(map.getKey() + " ");
                arrayList.add(map.getKey());
                duplicate = true;
            }
        }
        if (!duplicate) {
            arrayList.add(-1);
        }
//        arrayList.sort(Integer::compareTo);
        Collections.sort(arrayList);
        return arrayList;
    }
}
