package Practice.Test3;

public class test8 {
    public static void main(String[] args) {
        int a[] = {4, 5, 2, 25};
        int n = a.length;
        findNextGreaterElement(a, n);
    }

    private static void findNextGreaterElement(int[] a, int n) {
        int next;
        for (int i = 0; i < n; i++) {
            next = -1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    next = a[j];
                    break;
                }
            }
            System.out.println(a[i] + " --- " + next);
        }
    }
}
