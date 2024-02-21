package Practice.Test1;

public class Test9 {
    public static void main(String[] args) {
        //reverse string
//        String s = "abc";
        String s = "hello";
        reverseString(s, s.length());
    }

    private static void reverseString(String s, int n) {
        char[] ch = s.toCharArray();
        int start = 0, end = n - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(ch[i] + " ");
//        }

        String reverseString = String.valueOf(ch);
        System.out.println("reversed string: " + reverseString);
    }
}
