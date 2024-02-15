package Practice;

public class Test13 {
    public static void main(String[] args) {
        //palindrome
        String str = "abba";
//        String str = "abcded";
        boolean result = checkPalindrome(str);
        if (result) {
            System.out.println("String " + str + " is palindrome");
        } else {
            System.out.println("String " + str + " is not palindrome");
        }
    }

    private static boolean checkPalindrome(String str) {
        int n = str.length();
        boolean result = false;
        int i = 0, j = n - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return result;
            }
            i++;
            j--;
        }
        return true;
    }
}
