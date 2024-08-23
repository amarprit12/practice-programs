package Practice.Test10;

public class t3 {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
        boolean result = checkStringRotatedBy2Places(str1, str2);
        System.out.println(result);

    }

    private static boolean checkStringRotatedBy2Places(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() == 0) {
            return true;
        }
        String left = s1.substring(2) + s1.substring(0, 2);
        String right = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

        return s2.equals(left) || s2.equals(right);

    }
}
