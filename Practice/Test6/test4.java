package Practice.Test6;

import java.util.HashMap;

public class test4 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 3};
        findMissingAndRepeating(arr);
    }

    private static void findMissingAndRepeating(int[] a) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!hashMap.containsKey(a[i])) {
                hashMap.put(a[i], true);
            } else {
                System.out.println("Repeating: " + a[i]);
            }
        }

        for (int i = 1; i <= a.length; i++) {
//            if (hashMap.get(i) == null) {
//                System.out.println("Missing: " + i);
//            }
            if(!hashMap.containsKey(i)){
                System.out.println("Missing: " + i);
            }
        }
    }
}
