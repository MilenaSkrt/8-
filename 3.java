import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int N = in.nextInt();
        int[] array = new int[2 * N];
        System.out.println("Введите координаты точек:");
        for (int i = 0; i < 2 * N; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Номера точек, которые могут являться вершинами равностороннего треугольника:");
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (isTriangle(array, i, j, k)) {
                        System.out.printf("(%d, %d, %d)%n", i + 1, j + 1, k + 1);
                    }
                }
            }
        }
    }
    public static boolean isTriangle(int[] array, int i, int j, int k) {
        double d1 = distance(array[2 * i], array[2 * i + 1], array[2 * j], array[2 * j + 1]);
        double d2 = distance(array[2 * i], array[2 * i + 1], array[2 * k], array[2 * k + 1]);
        double d3 = distance(array[2 * j], array[2 * j + 1], array[2 * k], array[2 * k + 1]);

        return d1 == d2 && d2 == d3;
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
