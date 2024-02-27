package Practice.Test3;

public class test1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 7, 5};
        int n = a.length;
        int sum = 12;
        subArrayWithSum(a, n, sum);
    }

    private static void subArrayWithSum(int[] a, int n, int sum) {
        int currentSum = 0;
        for (int i = 0; i < n - 1; i++) {
            currentSum = a[i];
            if (currentSum == sum) {
                System.out.println("Sum found at index: " + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += a[j];
                    if (currentSum == sum) {
                        System.out.println("Sum found between index: " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found") ;
    }
}
