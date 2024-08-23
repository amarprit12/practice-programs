package Practice.Test9;

public class t3 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        printUnion(arr1, arr2, arr1.length, arr2.length);
    }

    private static void printUnion(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                System.out.print(a[i++]+ " ");
            } else if (b[j] < a[i]) {
                System.out.print(b[j++]+ " ");
            } else {
                System.out.print(a[i++]+ " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(a[i++] + " ");
        }
        while (j < n) {
            System.out.print(b[j++]+ " ");
        }
    }
}
