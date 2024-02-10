package Practice;

public class Test6 {
    //segregate even and odd
    public static void main(String[] args) {
        int[] a = {12, 34, 45, 9, 8, 90, 3};
        int n = a.length;
        segregateEvenOdd(a, n);
        printArray(a, n);
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

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
