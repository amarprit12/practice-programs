package Practice.Test10;

public class t8 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        findSubArrayWithGivenSum(arr, n, sum);
    }

    private static void findSubArrayWithGivenSum(int[] a, int n, int sum) {
        int start = 0;
        int currSum = 0;
        for (int end = 0; end < a.length; end++) {
            currSum += a[end];

            while (currSum > sum && start <= end) {
                currSum -= a[start];
                start++;
            }
            if (currSum == sum) {
                System.out.println("Subarray found at " + start + " end: " + end);
                return;
            }
        }
        System.out.println("no subarray found");
    }
}
