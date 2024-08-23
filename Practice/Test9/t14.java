package Practice.Test9;

public class t14 {
    public static void main(String[] args) {
        String s = "i like this program very much";
        reverseWords(s);

    }

    private static void reverseWords(String s) {
        String res = "";
        String[] ans = s.split(" ");
        for (int i = ans.length - 1; i >= 0; i--) {
            res += ans[i] + " ";
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}
