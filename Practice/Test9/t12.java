package Practice.Test9;

public class t12 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subArraySum(arr, arr.length, sum);
    }

    private static void subArraySum(int a[], int n, int sum) {
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum = a[i];
            if (currSum == sum) {
                System.out.println("Sum found at index: " + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currSum += a[j];
                    if (currSum == sum) {
                        System.out.println("Sum found at index: " + i + " and " + j);
                        return;
                    }
                    if (currSum > sum) {
                        break;
                    }
                }
            }

        }
        System.out.println("No subarray found");

    }
}
