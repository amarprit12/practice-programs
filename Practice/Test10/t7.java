package Practice.Test10;

public class t7 {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        findProduct(arr, arr.length);

    }

    private static void findProduct(int a[], int n) {
        int[] prod = new int[n];
        for (int i = 0; i < n - 1; i++) {
            prod[i] = 1;
            for (int j = i + 1; j < n; j++) {
                prod[i] = prod[i] * a[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prod[i] + " ");
        }
    }
}
