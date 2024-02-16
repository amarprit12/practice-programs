package Practice;

public class Test15 {
    public static void main(String[] args) {
//        int[] a = {1, 2, 4, 6, 3, 7, 8};
        int[] a = {1, 2, 3, 5};
        int n = a.length;
//        findMissingNo(a, n);
        findMissingNo1(a, n);
    }

    private static void findMissingNo(int[] a, int n) {
        int arraySum = 0;
        int total;
        for (int i = 0; i < n; i++) {
            arraySum += a[i];
        }
        total = ((n + 1) * (n + 2)) / 2;
        int missingNo = total - arraySum;
        System.out.println("MissingNo: " + missingNo);
    }

    // using XOR
    private static void findMissingNo1(int[] a, int n) {
        int x = 0, x1 = 0;
        int missingNo;
        for (int i = 0; i < n; i++) {
            x = x ^ a[i];
        }
        for (int i = 1; i <= n + 1; i++) {
            x1 = x1 ^ i;
        }
        missingNo = x ^ x1;
        System.out.println("Missing no: " + missingNo);
    }
}
