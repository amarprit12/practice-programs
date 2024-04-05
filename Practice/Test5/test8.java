package Practice.Test5;

import java.util.Arrays;

public class test8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = checkAnagram(str1, str2);
        if(result){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }

    }

    private static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
