import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int order = array.length;
        int[] diagonalSums = new int[2 * order - 1];

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                diagonalSums[i + j] += array[i][j];
            }
        }

        System.out.println(Arrays.toString(diagonalSums));
    }
}
