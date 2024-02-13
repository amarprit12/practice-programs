package Practice;

public class Test10 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 10, 40};
        int x = 10;
        linearSearch(a, a.length, x);

    }

    private static void linearSearch(int[] a, int n, int x) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Element " + x + " is present at index: " + index);
        } else {
            System.out.println("Element " + x + " is not present ");
        }
    }
}
