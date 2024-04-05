package Practice.Test5;

import java.util.HashMap;

public class test12 {
    public static void main(String[] args) {
        int a[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = a.length;
//        findMajority(a, n);
//        findMajority1(a, n);
        findMajority2(a, n);
    }

    private static void findMajority(int[] a, int n) {
        int count;
        int maxCount = 0;
        int index = -1;
        int majority = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2) {
            System.out.println("majority element: " + a[index]);
        } else {
            System.out.println("not majority");
        }
    }

    private static void findMajority1(int[] a, int n) {

        int candidate = findCandidate(a, n);
        boolean isMajority = checkMajority(a, n, candidate);
        System.out.println(isMajority);
    }

    private static boolean checkMajority(int[] a, int n, int element) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        if (count > n / 2) {
            return true;
        } else {
            return false;
        }
    }

    private static int findCandidate(int a[], int n) {
        int count = 1;
        int majIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[majIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majIndex = i;
                count = 1;
            }
        }
        return a[majIndex];
    }

    // hashing
    private static void findMajority2(int[] a, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(a[i])) {
                int count = hashMap.get(a[i]);
                hashMap.put(a[i], count + 1);
            } else {
                hashMap.put(a[i], 1);
            }
            if (hashMap.get(a[i]) > n / 2) {
                System.out.println("Majority: "+ a[i]);
                return;
            }
        }
        System.out.println("No majority");
    }


}
