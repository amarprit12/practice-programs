package Practice.Test9;

import java.util.HashMap;

public class t1 {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        boolean result = checkSubset(arr1, arr2);
        if (result) {
            System.out.println("Array is subset");
        } else {
            System.out.println("not subset");
        }
    }

    private static boolean checkSubset(int a1[], int a2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            if (hashMap.containsKey(a1[i])) {
                int count = hashMap.getOrDefault(a1[i], 0);
                hashMap.put(a1[i], count + 1);
            } else {
                hashMap.put(a1[i], 1);
            }
        }

        for (int i = 0; i < a2.length; i++) {
            if (hashMap.get(a2[i]) > 0) {
                hashMap.put(a2[i], hashMap.get(a2[i]) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

}
