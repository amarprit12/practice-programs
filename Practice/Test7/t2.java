package Practice.Test7;

import java.util.HashMap;
import java.util.HashSet;

public class t2 {
    public static void main(String[] args) {


//        boolean isSubSet = isSubSet(a1, a2, a1.length, a2.length);
//        int[] a1 = {11, 1, 13, 21, 3, 7};
//        int[] a2 = {11, 3, 7, 1};
//        boolean isSubSet1 = isSubSet1(a1, a2, a1.length, a2.length);
//        System.out.println(isSubSet1);
//        if (isSubSet) {
//            System.out.println("Array is subset");
//        } else {
//            System.out.println("Not subset");
//        }

//        long[] a1 = {11, 1, 13, 21, 3, 7};
//        long[] a2 = {11, 3, 7, 1};
        long[] a1 = {589, 5847, 595, 959, 258};
        long[] a2 = {258, 25};
        String res = isSubset(a1, a2, a1.length, a2.length);
        System.out.println(res);

    }
//
//    private static boolean isSubSet(long[] a1, long[] a2, int m, int n) {
//        HashSet<Long> hashSet = new HashSet<>();
//
//
//        for (int i = 0; i < m; i++) {
//            if (!hashSet.contains(a1[i])) {
//                hashSet.add(a1[i]);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (!hashSet.contains(a2[i])) {
//                return false;
//            }
//        }
//        return true;
//    }


    //int[] a1 = {11, 1, 13, 21, 3, 7};
    // int[] a2 = {11, 3, 7, 1};
//    private static boolean isSubSet1(int[] a1, int[] a2, int m, int n) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            if (hashMap.containsKey(a1[i])) {
//                int count = hashMap.getOrDefault(a1[i], 0);
//                hashMap.put(a1[i], count + 1);
//            } else {
//                hashMap.put(a1[i], 1);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            int count = hashMap.getOrDefault(a2[i], 0);
//            if (count == 0) {
//                return false;
//            }
//            hashMap.put(a2[i], count - 1);
//        }
//        return true;
//    }
    public static String isSubset(long a1[], long a2[], long n, long m) {

        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(a1[i])) {
                int count = hashMap.getOrDefault(a1[i], 0);
                hashMap.put(a1[i], count + 1);
            } else {
                hashMap.put(a1[i], 1);
            }
        }
        for (int i = 0; i < m; i++) {
            int count = hashMap.getOrDefault(a2[i], 0);
            if (count == 0) {
                return "No";
            }
            hashMap.put(a2[i], count - 1);
        }
        return "Yes";
    }
}
