import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение K: ");
        int k = in.nextInt();
        int minElement = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minElement = Math.min(minElement, matrix[i][j]);
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int replacements = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isLocalMax = true;

                for (int[] direction : directions) {
                    int newRow = i + direction[0];
                    int newCol = j + direction[1];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                        if (matrix[newRow][newCol] >= matrix[i][j]) {
                            isLocalMax = false;
                            break;
                        }
                    }
                }
                if (isLocalMax) {
                    matrix[i][j] = minElement * (-k);
                    replacements++;
                }
            }
        }
        System.out.println("Количество замен: " + replacements);
        System.out.println("Матрица после замены локальных максимумов:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
