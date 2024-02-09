package Practice;

public class Test1 {

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90};
        int n = a.length;
        System.out.print("Array before sorting: ");
        printArray(a, n);
        bubbleSort(a, n);
        System.out.print("\nArray after sorting: ");
        printArray(a, n); // print array after sorting

    }

    private static void bubbleSort(int[] a, int n) {
        int i, j, temp;
        boolean swapped;
        for (j = 1; j <= n - 1; j++) { // passes
            swapped = false;
            for (i = 0; i < n - j; i++) {
                if (a[i] > a[i + 1]) { // swapping a[i], a[i+1]
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
