package Practice.Test9;

public class t6 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        reverseArray(a, a.length);
        printArray(a, a.length);

    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void reverseArray(int a[], int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
