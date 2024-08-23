package Practice.Test9;

import java.util.HashMap;
import java.util.Map;

public class t8 {
    public static void main(String[] args) {
        int a[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        findMajority(a, a.length);
    }

    private static void findMajority(int[] a, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i])) {
                int count = hm.get(a[i]);
                hm.put(a[i], count + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()> n/2){
                System.out.println("Majority: "+  entry.getKey());
            }
        }
    }

}
