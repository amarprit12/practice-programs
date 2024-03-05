package Practice.Test3;

public class test9 {
    public static void main(String[] args) {
        int[][] A = {{1, 1},
                {2, 2}};

        int[][] B = {{1, 1},
                {2, 2}};
        multiply(A, B, A.length);
    }

    private static void multiply(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printArray(C, n);
    }

    private static void printArray(int[][] C, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(C[i][j] + " ");
            }
        }
    }

}
