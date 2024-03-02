package Practice.Test3;

public class test6 {
    public static void main(String[] args) {
        int n = 7;
        boolean result = checkPrime(n);
        if (result) {
            System.out.println("Prime no");
        } else {
            System.out.println("Not prime");
        }
    }

    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
