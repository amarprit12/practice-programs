package Practice.Test9;

import java.util.HashMap;
import java.util.Map;

public class t2 {
    public static void main(String[] args) {
        String str = "hheelloo";
        findNonRepeating(str);

    }

    private static void findNonRepeating(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), count + 1);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }
        boolean exists = false;
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) {
                exists = true;
                System.out.println(str.charAt(i));
                break;
            }
        }
        if (!exists) {
            System.out.println('$');
        }
    }


    static char nonrepeatingCharacter(String str) {
        //Your code here

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
                return str.charAt(i);
            }
        }

        return '$';
    }


}
