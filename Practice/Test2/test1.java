package Practice.Test2;

public class test1 {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, -1};
        int k = 6;
        countPairsWithGivenSum(a, a.length, k);
    }

    private static void countPairsWithGivenSum(int[] a, int n, int k) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
