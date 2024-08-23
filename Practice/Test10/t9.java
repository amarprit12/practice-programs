package Practice.Test10;

import java.util.HashMap;

public class t9 {
    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 6, 3, 6, 1};
        int a[] ={1, 2, 3, 4 ,3};
        int n = a.length;
        findDuplicates(a, n);
    }

    private static void findDuplicates(int[] a, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i])) {
                int count = hm.get(a[i]);
                hm.put(a[i], count + 1);
            } else {
                hm.put(a[i], 1);
            }
//            if (hm.get(a[i]) > 1) {
//                System.out.print(a[i]+ " ");
//            }
        }

        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                System.out.println(key);
            }
        }
    }
}
