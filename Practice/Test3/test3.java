package Practice.Test3;

public class test3 {
    public static void main(String[] args) {
        int[] a = {0, -1, 2, -3, 1};
        int x = -2;
        boolean result = checkPair(a, a.length, x);
        if (result) {
            System.out.println("pair exists");
        } else {
            System.out.println("pair doesn't exist");
        }
    }

    private static boolean checkPair(int[] a, int n, int x) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == x) {
                    System.out.println(a[i] + " " + a[j] + " ");
                    return true;
                }
            }
        }
        return false;
    }
}
