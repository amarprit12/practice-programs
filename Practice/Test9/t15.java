package Practice.Test9;

import java.util.HashMap;

public class t15 {
    public static void main(String[] args) {
        char[] s = "geeksforgeeks".toCharArray();
        removeDuplicates(s);

    }

    private static void removeDuplicates(char[] s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String st = "";
        for (int i = 0; i < s.length; i++) {
            if (!hashMap.containsKey(s[i])){
                st += s[i];
                hashMap.put(s[i], 1);
            }
        }
        System.out.println(st);
    }
}
