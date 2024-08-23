package Practice.Test10;

public class t6 {
    public static void main(String[] args) {
        int result = strStr("sadbutsad", "sad");
        System.out.println(result);
    }


    public static int strStr(String main, String sub) {
        if (sub.isEmpty()) {
            return 0;
        }
        int mainLength = main.length();
        int subLength = sub.length();
        for (int i = 0; i <= mainLength - subLength; i++) {
            if (main.substring(i, i + subLength).equals(sub)) {
                return i;
            }
        }
        return -1;
    }
}
