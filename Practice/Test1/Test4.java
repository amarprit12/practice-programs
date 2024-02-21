package Practice.Test1;

public class Test4 {
    public static void main(String[] args) {
//        int[] a = {1, 2, 0, 4, 3, 0, 5, 0};
//        int[] a = {1, 2, 0, 0, 0, 3, 6};
        int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = a.length;
        moveAllZeroesToEnd(a, n);
        printArray(a, n);
    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //moveAllZeroesToEnd
    private static void moveAllZeroesToEnd(int[] a, int n) {
        int j = 0; // count of non-zero elements
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }
        while (j < n) {
            a[j++] = 0;
        }

    }

}
