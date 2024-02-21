package Practice.Test1;

public class Test21 {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int n = a.length;
        segregate0And1(a, n);
        printArray(a, n);

    }

//   segregate0And1
    private static void segregate0And1(int[] a, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            while (a[i] == 0 && i < j) {
                i++;
            }
            while (a[j] == 1 && i < j) {
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
