package Practice.Test7;

public class t1 {
    public static void main(String[] args) {
        int a[] = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakIndex(a, a.length);
        System.out.println(peakIndex);
    }

    private static int findPeakIndex(int[] a, int n) {
        if (n == 1) {
            return 0;
        }
        if (a[0] >= a[1]) {
            return 0;
        }
        if (a[n - 1] >= a[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
