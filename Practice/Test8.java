package Practice;

public class Test8 {
    // sort array of 0,1 and 2
    public static void main(String[] args) {
//        int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] a = {0, 1, 2, 0, 1, 2};
        sortArray012(a, a.length);
        printArray(a, a.length);


    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    private static void sortArray012(int[] a, int n) {
        int low = 0, high = n - 1;
        int mid = 0, temp;
        while (mid <= high) {
            switch (a[mid]) {
                case 0 -> {
//                    swap(a[low], a[mid]);
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;

                }
                case 1 -> mid++;
                case 2 -> { // swap(a[mid], a[high);
                    temp = a[high];
                    a[high] = a[mid];
                    a[mid] = temp;
                    high--;
                }
            }
        }

    }


}
