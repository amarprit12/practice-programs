package Practice.Test1;

public class Test19 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 5, 7};
        int[] a2 = {2, 3, 5, 6};
        int m = a1.length;
        int n = a2.length;
        printUnion(a1, a2, m, n);
        System.out.println("\nIntersection");
        printIntersection(a1, a2, m, n);
    }

    private static void printUnion(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) { // print smaller
                System.out.print(a[i++] + " ");
            } else if (b[j] < a[i]) {
                System.out.print(b[j++] + " ");
            } else {
                System.out.print(a[i++] + " "); // print common
                j++;
            }
        }
        while (i < m) {
            System.out.print(a[i++] + " ");
        }
        while (j < n) {
            System.out.print(b[j++] + " ");
        }
    }

    private static void printIntersection(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.print(a[i++] + " ");
                j++;
            }
        }
    }

}
