package Practice.Test9;

public class t10 {
    public static void main(String[] args) {
        int a1[] = {1, 3, 4, 5, 7};
        int a2[] = {2, 3, 5, 6};
        printUnion(a1, a2, a1.length, a2.length);
    }

    private static void printUnion(int a1[], int a2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a1[i] < a2[j]) {
                System.out.print(a1[i++] + " ");
            } else if (a2[j] < a1[i]) {
                System.out.print(a2[j++] + " ");
            } else {
                System.out.print(a1[i++] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(a1[i++] + " ");
        }
        while (j < n) {
            System.out.print(a2[j++] + " ");
        }
    }
}
