package Practice.Test4;

import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        String str = "test string";
        printDuplicates(str);

    }

    private static void printDuplicates(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), count + 1);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + " count = " + entry.getValue());
            }
        }

    }
}
