package Practice.Test5;

import java.util.Arrays;

public class test10 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {2, 4, 5, 0, 1};
        int n = arr1.length;
        int m = arr2.length;
        boolean result = checkArraysAreEqual(arr1, arr2, n, m);
        if(result){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }

    private static boolean checkArraysAreEqual(int[] a1, int[] a2, int n, int m) {
        if (n != m) {
            return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < n; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;

    }
}
