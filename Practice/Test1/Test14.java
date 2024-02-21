package Practice.Test1;

public class Test14 {
    public static void main(String[] args) {
        // tower of hanoi
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    //towerOfHanoi
    private static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Moving disk " + n + " from : " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
}
