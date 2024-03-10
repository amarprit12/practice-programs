package Practice.Test4;

import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        removeDuplicates(str);
    }

    private static void removeDuplicates(String str) {
        StringBuilder s = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                s.append(str.charAt(i));
                hashMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(s);
    }

}
