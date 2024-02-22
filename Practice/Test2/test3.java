package Practice.Test2;

public class test3 {
    public static void main(String[] args) {
        int a[] = {12, 13, 1, 10, 34, 1};
        int n = a.length;
        findSmallestAndSecondSmallest(a, n);
    }

    private static void findSmallestAndSecondSmallest(int[] a, int n) {
        int smallest, secondSmallest;
        smallest = secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);

    }
}
