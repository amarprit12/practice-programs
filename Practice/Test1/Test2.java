package Practice.Test1;

public class Test2 {
    public static void main(String[] args) {
//        int[] a = {10, 4, 3, 50, 23, 90};
        int[] a = {12, 13, 1, 10, 34, 1};

        int n = a.length;
        System.out.print("Array elements: ");
        printArray(a, n);
        findLargestThreeElements(a, n);

    }

    //findLargestThreeElements
    private static void findLargestThreeElements(int[] a, int n) {
        int first, second, third;
        if (n < 3) {
            System.out.println("Invalid input");
            return;

        }

        first = second = third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            } else if (a[i] > third) {
                third = a[i];
            }
        }
//        System.out.println("first: " + first + " second: " + second + " third: " + third);
        System.out.println(first + "," + second + "," + third);
        System.out.println("Three largest elements are " + first + " " + second + " " + third);

    }

    private static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
