package Practice.Test5;

public class test1 {
    public static void main(String[] args) {
        String s = "abba";
        boolean result = checkPalindrome(s);
        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

    private static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
