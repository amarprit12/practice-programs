package Practice.Test5;

import java.util.HashSet;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};
        int result = NumberofElementsInIntersection(arr1, arr2, arr1.length, arr2.length);
        System.out.println(result);
    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Set<Integer> hashset = new HashSet<>();
        for (int num : a) {
            hashset.add(num);
        }
        int count = 0;
        for (int num : b) {
            if (hashset.contains(num)) {
                count++;
                hashset.remove(num);
            }
        }
        return count;
    }

    public static int NumberofElementsInUnion(int a[], int b[], int n, int m) {
        Set<Integer> hashset = new HashSet<>();
        for (int num : a) {
            hashset.add(num);
        }

        for (int num : b) {
            hashset.add(num);
        }
        return hashset.size();
    }
}
