package Practice.Test9;

import java.util.HashSet;

public class t16 {
    public static void main(String[] args) {
        char[] ch = "geeksforgeeks".toCharArray();
        char c = findFirstRepeatedChar(ch);
        System.out.println(c);

    }

    private static char findFirstRepeatedChar(char[] ch) {
        HashSet<Character> hashSet = new HashSet<>();
        for (Character c : ch) {
            if (hashSet.contains(c)) {
                return c;
            } else {
                hashSet.add(c);
            }
        }
        return '\0';
    }
}
