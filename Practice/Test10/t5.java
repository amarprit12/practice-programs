package Practice.Test10;

import java.util.HashMap;
import java.util.Map;

public class t5 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicate(s);
    }

    private static void printDuplicate(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i), count + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " " + entry.getValue() + " ");
            }
        }
    }

}
