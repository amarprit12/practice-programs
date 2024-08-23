package Practice.Test7;

public class t5 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr, arr.length);
        printArray(arr, arr.length);
    }

    private static void segregateElements(int[] a, int n) {
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


    private static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
