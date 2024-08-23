package Practice.Test10;

import java.util.Scanner;

public class t12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            maxValue = Math.max(current, maxValue);
        }
        System.out.println(maxValue);
    }
}
