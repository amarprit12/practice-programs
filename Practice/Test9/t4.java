package Practice.Test9;

import java.util.HashMap;

public class t4 {
    public static void main(String[] args) {
        String str = "Machine";
        boolean result = checkIsogram(str);
        if (result) {
            System.out.println("Isogram");
        } else {
            System.out.println("not isogram");
        }
    }

    private static boolean checkIsogram(String str) {
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
            if (hashMap.get(str.charAt(i)) > 1) {
                return false;
            }
        }
        return true;
    }
}
