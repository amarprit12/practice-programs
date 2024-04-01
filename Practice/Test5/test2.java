package Practice.Test5;

public class test2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 7, 8, 8, 9, 8, 0, 0, 0, 8};
        int key = 8;
        findIndex(a, a.length, key);
    }

    private static void findIndex(int[] a, int n, int key) {
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                start = i;
                break;
            }
        }
        if (start == -1) {
            System.out.println("Element not present in array");
        }
        for (int i = n - 1; i >= start; i--) {
            if (a[i] == key) {
                end = i;
                break;
            }
        }
        if (start == end) {
            System.out.println("Only start index is present: " + start);
        } else {
            System.out.println("Start index is present at: " + start + " end index: " + end);
        }
    }
}
