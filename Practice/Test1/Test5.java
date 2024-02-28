package Practice.Test1;

public class Test5 {
    // kadane algo
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSubArraySum(a, a.length);
        System.out.println("maximum contiguous sum is : " + result);

    }

    // maxSubArraySum
    private static int maxSubArraySum(int[] a, int n) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnd = 0;
        int start = 0, end = 0, s = 0;
        for (int i = 0; i < n; i++) {
            maxEnd += a[i];
            if (maxSoFar < maxEnd) {
                maxSoFar = maxEnd;
                start = s;
                end = i;
            }
            if (maxEnd <= 0) {
                maxEnd = 0;
                s = i + 1;
            }
        }
        System.out.println("Start: " + start + " end : " + end);
        return maxSoFar;
    }

}
