package Practice.Test1;

public class Test11 {
    public static void main(String[] args) {
        // binary search
        int[] a = {2, 3, 4, 10, 40};
        int x = 10;
        int index = binarySearch(a, a.length, x);
        if (index == -1) {
            System.out.println("Element " + x + " is not present ");
        } else {
            System.out.println("Element " + x + " is present at index: " + index);
        }
    }

    private static int binarySearch(int[] a, int n, int x) {
        int l = 0, h = n - 1;
        int index = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (x == a[mid]) {
                index = mid;
                break;
            } else if (x > a[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return index;
    }
}
