package Practice;

public class Test12 {
    public static void main(String[] args) {
//        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4};
        int n = a.length;
        findMajority(a, n);
    }

    private static void findMajority(int[] a, int n) {
        int i, j;
        int count;
        int maxCount = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (i = 0; i < n; i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxIndex = i;
            }
        }
        if (maxCount > n / 2) {
            System.out.println("majority element exists: " + a[maxIndex]);
        } else {
            System.out.println("majority element does not exists");
        }

    }


}
