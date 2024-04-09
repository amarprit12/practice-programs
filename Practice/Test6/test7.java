package Practice.Test6;

public class test7 {
    public static void main(String[] args) {
        int n = 9;
        int res = printFib(n);
        System.out.println(res);

        int res1 = fib(9);

        System.out.println(res1);
    }

    private static int printFib(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}


