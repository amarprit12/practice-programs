package Practice.Test10;

public class t1 {
    public static void main(String[] args) {
        int[] a = {-2, 3, 4, -1};
        rearrange(a, a.length);
        printArray(a, a.length);
    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void rearrange(int[] a, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            while (a[i] > 0 && i < j) {
                i++;
            }
            while (a[j] < 0 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
    }
}
