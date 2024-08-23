package Practice.Test10;

import java.util.HashMap;
import java.util.Map;

public class t15 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        findFirstNonRepeating(str, str.length());
    }

    private static void findFirstNonRepeating(String str, int n) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(str.charAt(i))) {
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), count + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        for (Character c : str.toCharArray()) {
            if (hm.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}