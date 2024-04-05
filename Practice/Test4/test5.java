package Practice.Test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test5 {
    public static void main(String[] args) {
        int a[] = {0, 3, 1, 2};
        int N = 4;
        ArrayList<Integer> arrayList = findDuplicates(a, N);
        System.out.println(arrayList);
    }

//    private static ArrayList<Integer> findDuplicates(int[] a, int n) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        ArrayList<Integer> arrayList = new ArrayList();
//        boolean duplicate = false;
//        for (int i = 0; i < n; i++) {
//            if (hashMap.containsKey(a[i])) {
//                int count = hashMap.get(a[i]);
//                hashMap.put(a[i], count + 1);
//            } else {
//                hashMap.put(a[i], 1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//            if (entry.getValue() > 1) {
////                arrayList.add(entry.getValue());
//                System.out.println(entry.getKey());
//                arrayList.add(entry.getKey());
//                duplicate = true;
//            }
//        }
//        if (duplicate) {
//            // System.out.println(arrayList);
//            return arrayList;
//        } else {
////            System.out.println(-1);
//            arrayList.add(-1);
//            return arrayList;
//        }
//
//
//    }


    private static ArrayList<Integer> findDuplicates(int[] a, int n) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            boolean duplicate = false;
            for (int j = i; j < n; j++) {
                if (hashMap.containsKey(a[j])) {
                    int count = hashMap.get(a[j]);
                    hashMap.put(a[j], count + 1);
                } else {
                    hashMap.put(a[j], 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() > 1) {
                    arrayList.add(entry.getKey());
                    duplicate = true;
                }
            }
            if (!duplicate) {
                arrayList.add(-1);
            }
        }
        return arrayList;
    }
}


