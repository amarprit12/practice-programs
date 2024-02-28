package Practice.Test3;

public class test2 {
    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        String str2 = "GeeksforGeeks";
        boolean result = compareStrings(str1, str2);
        if (result) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    private static boolean compareStrings(String str1, String str2) {

        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
