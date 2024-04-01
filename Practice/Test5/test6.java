package Practice.Test5;

import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
//        findCommonElements(A, B, C);
        findCommonElements1(A, B, C);
    }

    //    private static void findCommonElements(int[] a, int[] b, int[] c) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                for (int k = 0; k < c.length; k++) {
//                    if (a[i] == b[j] && b[j] == c[k]) {
//                        System.out.print(a[i] + " ");
//                    }
//                }
//            }
//        }
//    }
    private static void findCommonElements(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i++]);
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
    }

    private static void findCommonElements1(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
//                System.out.println(a[i++]);
                // If the list is empty, or if the last element in the list1!= current element
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != a[i]) {
                    arrayList.add(a[i]);
                }
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println(arrayList);
    }

}
