package Practice.Test2;

public class test6 {
    public static void main(String[] args) {
        String str = "aaaad";
//        String str = "abcd";
        boolean result = checkRotation(str);
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    private static boolean checkRotation(String str) {
        if (isPalindrome(str)) {
            return true;
        }
        String concatenatedString = str.concat(str);
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        return concatenatedString.contains(reversed);
    }

    private static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return false;
        }
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
