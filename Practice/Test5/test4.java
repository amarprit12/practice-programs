package Practice.Test5;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = find(arr, arr.length, 8);
        System.out.println(arrayList);

    }

    private static ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a : arr) {
            arrayList.add(a);
        }
        int first = findFirst(arrayList, x);
        int last = findLast(arrayList, x);
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        System.out.println(first);
        System.out.println(last);
        arrayList1.add(first);
        arrayList1.add(last);
        return arrayList1;

    }

    private static int findFirst(ArrayList<Integer> list, int x) {
        return list.indexOf(x);
    }

    private static int findLast(ArrayList<Integer> list, int x) {
        return list.lastIndexOf(x);
    }
}
