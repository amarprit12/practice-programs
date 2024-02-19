package Practice;

public class Test17 {
    public static void main(String[] args) {
        int[] a = {0, -1, 2, -3, 1};
        int n = a.length;
        findTriplets(a, n);
    }

    private static void findTriplets(int[] a, int n) {
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = i + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(" " + a[i] + "  " + a[j] + "  " + a[k]);
                        break;
                    }
                }
            }
        }
    }
}
