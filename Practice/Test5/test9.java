package Practice.Test5;

import java.util.Stack;

public class test9 {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        printleaders(arr, arr.length);

    }

//    private static void printleaders(int a[], int n) {
//        int maxFromRight = a[n - 1];
//        System.out.print(a[n - 1] + " ");
//        for (int i = n - 2; i >= 0; i--) {
//            if (a[i] > maxFromRight) {
//                maxFromRight = a[i];
//                System.out.print(maxFromRight + " ");
//            }
//        }
//    }

    private static void printleaders(int a[], int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(a[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > stack.peek()) {
                stack.push(a[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
