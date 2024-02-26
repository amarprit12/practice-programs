package Practice.Test2;

public class test7 {
    public static void main(String[] args) {
        int a[] = {10, 20, 35, 50, 75, 80};
        int sum = 70;
//        findPairsWithGivenSum(a, a.length, sum);
        findPairsWithGivenSum1(a,a.length,sum);
    }

    private static void findPairsWithGivenSum(int[] a, int n, int sum) {

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (a[i] + a[j] == sum) {
                    System.out.println("indexes are: " + i + " " + j);
                    return;
                }
            }
            System.out.println("No pair found with the given sum");
        }
    }

    private static boolean findPairsWithGivenSum1(int[] a, int n, int sum) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] == sum) {
                System.out.println("indexes are: " + i + " " + j);
                return true;
            } else if (a[i] + a[j] > sum) {
                j--;
            } else {
                i++;
            }

        }
        return false;
    }
}
