package Practice.Test2;

public class test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 9};
        int[] arr2 = {4, 5, 7, 9};
        findMissingElement(arr1, arr2);

    }

    private static void findMissingElement(int[] a1, int[] a2) {
        int missingElement = 0;
        for (int i = 0; i < a1.length; i++) {
            missingElement ^= a1[i];
        }
        for (int j = 0; j < a2.length; j++) {
            missingElement ^= a2[j];
        }
        System.out.println(missingElement);
    }
}
