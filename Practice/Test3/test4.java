package Practice.Test3;

public class test4 {
    public static void main(String[] args) {
        String str = "abcd";
        printAllSubString(str);
    }

    private static void printAllSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
