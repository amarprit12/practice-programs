package Practice.Test5;

public class test3 {
    public static void main(String[] args) {
        //first and last occurrence in sorted array
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 8;
        int n = arr.length;
        int first = findFirst(arr, n, x);
        int last = findLast(arr, n, x);
        System.out.println(first);
        System.out.println(last);
    }

    private static int findFirst(int[] a, int n, int x) {
        int low = 0, high = n - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > a[mid]) {
                low = mid + 1;
            } else if (x < a[mid]) {
                high = mid - 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }


    private static int findLast(int[] a, int n, int x) {
        int low = 0, high = n - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x > a[mid]) {
                low = mid + 1;
            } else if (x < a[mid]) {
                high = mid - 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
