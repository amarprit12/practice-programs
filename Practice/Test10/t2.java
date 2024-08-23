package Practice.Test10;

public class t2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;
        findMissingNo(arr, arr.length);
    }

    private static void findMissingNo(int[] a, int length) {
        int x0 = 0;
        int x1 = 0;
        for (int i = 0; i < length; i++) {
            x0 = x0 ^ a[i];
        }
        for (int i = 1; i <= length + 1; i++) {
            x1 = x1 ^ i;
        }
        int missing = x0 ^ x1;
        System.out.println(missing);
    }
}
