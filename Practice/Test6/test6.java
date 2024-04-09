package Practice.Test6;

import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        int a[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        findTripletsWithGivenSum(a, a.length, sum);
    }

    private static void findTripletsWithGivenSum(int[] a, int n, int sum) {
        boolean found = false;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int h = n - 1;
            while (l < h) {
                if (a[i] + a[l] + a[h] == sum) {
                    found = true;
                    System.out.println(a[i] + " " + a[l] + " " + a[h]);
                    l++;
                    h--;

                } else if (a[i] + a[l] + a[h] < sum) {
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



