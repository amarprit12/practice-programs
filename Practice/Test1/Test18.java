package Practice.Test1;

public class Test18 {
    public static void main(String[] args) {
//        int[] a = {12, 3, 4, 1, 6, 9};
//        int sum = 24;

        int[] a = {1, 2, 3, 4, 5};
        int sum = 9;
        boolean found = findTripletsWithGivenSum(a, a.length, sum);
        if (!found) {
            System.out.println("Triplets don't exist");
        }
    }

    private static boolean findTripletsWithGivenSum(int[] a, int n, int sum) {
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
