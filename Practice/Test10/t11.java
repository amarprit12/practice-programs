package Practice.Test10;

import java.util.Scanner;

public class t11 {
    public static void main(String[] args) {
        // largest of N numbers
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        findMax(num, n);
    }

    private static void findMax(int[] num, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
