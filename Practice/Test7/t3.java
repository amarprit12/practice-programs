package Practice.Test7;

public class t3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        int[] res = countOddEven(a, n);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    private static int[] countOddEven(int[] a, int n) {
        int countEven = 0, countodd = 0;
        int res[] = new int[2];
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            } else {
                countodd++;
            }
        }
        res[0] = countEven;
        res[1] = countodd;
        return res;
    }
}
