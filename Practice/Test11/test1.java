package Practice.Test11;

public class test1 {
    public static void main(String[] args) {
//        int a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int a[] =  {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int result = maximumIndex(a, a.length);
        System.out.println(result);
    }

    private static int maximumIndex(int a[], int n) {
        int result;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] <= a[j]) {
                    result = j - i;
                    if (result > max) {
                        max = result;
                    }
                }
            }
        }
        return max;
    }
}
