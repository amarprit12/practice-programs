package Practice.Test4;

import java.util.HashMap;

public class test4 {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        findFistNonRepeatingChar(str);
    }

    private static void findFistNonRepeatingChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), count + 1);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) {
                System.out.println("First non repeating: " + str.charAt(i));
                break;
            }
        }
    }

}
