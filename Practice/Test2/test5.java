package Practice.Test2;

public class test5 {
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int n = a.length;
        printLeaders(a, n);
    }

    //    private static void printLeaders(int[] a, int n) {
//        System.out.print(a[n - 1] + " ");
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] > a[j]) {
//                    System.out.print(a[i] + " ");
//                } else {
//                    break;
//                }
//            }
//        }
//    }
    private static void printLeaders(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (a[i] <= a[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.print(a[i] + " ");
            }
        }
    }

}
