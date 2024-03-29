package Practice.Test4;

public class test3 {
    public static void main(String[] args) {
//        Find common elements in three sorted arrays
        int ar1[] = {1, 5, 5};
        int ar2[] = {3, 4, 5, 5, 10};
        int ar3[] = {5, 5, 10, 20};
        findCommonElements(ar1, ar2, ar3);
    }

    private static void findCommonElements(int[] a1, int[] a2, int[] a3) {
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length && k < a3.length) {
            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                System.out.print(a1[i] + " ");
                i++;
                j++;
                k++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
