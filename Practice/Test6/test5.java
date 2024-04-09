package Practice.Test6;

import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int a[] = {0, -1, 2, -3, 1};
        findTripletsWithZeroSum(a, a.length);
    }

    private static void findTripletsWithZeroSum(int[] a, int n) {
        boolean found = false;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {

            int l = i + 1;
            int h = n - 1;

            while (l < h) {
                if (a[i] + a[l] + a[h] == 0) {
                    System.out.println(a[i] + " " + a[l] + " " + a[h]);
                    found = true;
                    l++;
                    h--;
                } else if (a[i] + a[l] + a[h] < 0) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        if (!found) {
            System.out.println("Triplet doesnt exist");
        }
    }
}
