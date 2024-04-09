package Practice.Test6;

import java.util.HashMap;

public class test8 {
    public static void main(String[] args) {
        int n = 9;
        int res = printFib(n);
        System.out.println(res);

    }

    private static int printFib(int n) {
        if (n <= 1) {
            return n;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if (hashMap.containsKey(n)) {
            hashMap.get(n);
        }
        int res = printFib(n - 1) + printFib(n - 2);
        hashMap.put(n, res);

        return res;
    }
}
