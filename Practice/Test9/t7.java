package Practice.Test9;

public class t7 {
    public static void main(String[] args) {
        int a[] = {7, 2, 9, 4, 6, 1, 3, 8, 5};
        segregateEvenOdd(a, a.length);
        printArray(a, a.length);
    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void segregateEvenOdd(int[] a, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            while (a[i] % 2 == 0 && i < j) {
                i++;
            }
            while (a[j] % 2 == 1 && i < j) {
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
