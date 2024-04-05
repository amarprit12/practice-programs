package Practice.Test5;

public class test7 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int K = 3;
        reverseArrayInGroup(a, a.length, K);
        printArray(a, a.length);
    }

    private static void reverseArrayInGroup(int[] a, int n, int k) {
        for (int i = 0; i < n; i = i + k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            while (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
    }

    private static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
