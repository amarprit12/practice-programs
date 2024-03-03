package Practice.Test3;

public class test7 {
    public static void main(String[] args) {
        // equilibrium point
        int a[] = {-7, 1, 5, 2, -4, 3, 0};
        int n = a.length;
        int index = findEquilibrium(a, n);
        if (index != -1) {
            System.out.println("index: "+ index);
            System.out.println(a[index] + " ");
        } else {
            System.out.println("No equilibrium point");
        }
    }

    private static int findEquilibrium(int[] a, int n) {
        int sum = 0, leftSum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += a[i];
        }
        return -1;
    }
}
