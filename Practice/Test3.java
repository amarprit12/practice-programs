package Practice;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {12, 35, 1, 10, 34, 1};
//        int[] a = {10, 5, 10};
//        int[] a = {10, 10, 10};
        int n = a.length;
        findSecondLargest(a, n);
    }

    private static void findSecondLargest(int[] a, int n) {
        int first, second;
        if (n < 2) {
            System.out.println("Invalid input");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("The second largest does not exist");
        } else {
            System.out.println("The first largest element: " + first);
            System.out.println("The second largest element is " + second);
        }
    }
}
