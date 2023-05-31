import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите значение порядка метрицы 2Nx2N ");
        int N = scn.nextInt();
        int n = 2 * N;
        int mas[][] = BigMas(n);


        for (int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas.length;j++){
                System.out.printf(mas[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public static int[][] BigMas(int n){
        int mas[][] = new int[n][n];
        int MasLeft[][] = MasForAll(n / 2 ,"left");
        int MasRight[][] = MasForAll(n / 2,"right");
        for (int j = 0; j < MasLeft.length; j++) {
            for (int i = 0; i < MasLeft.length; i++) {
                mas[j][i] = MasLeft[j][i];
                mas[j + n / 2][i] = MasLeft[j][i];
            }
        }
        for (int j = 0; j < MasRight.length; j++) {
            for (int i = 0; i < MasRight.length; i++) {
                mas[j][i + n / 2] = MasRight[j][i];
                mas[j + n / 2][i + n / 2] = MasRight[j][i];
            }
        }
        return mas;
    }
    public static int[][] MasForAll(int n, String m){
        int mas[][] = new int[n][n];
        int count = 0;
        if (m.equals("left")) {
            while (mas[0][0] == 0) {
                for (int i = 1; i <= n; i++) {
                    int y = i;
                    for (int x = 1; x <= i; x++) {
                        count++;
                        if (i % 2 == 1) {
                            mas[n - x][n - y] = count;
                        } else {
                            mas[n - y][n - x] = count;
                        }
                        y--;
                    }
                }
                for (int i = 2; i <= n; i++) {
                    int y = i;
                    for (int x = n; x >= i; x--) {
                        count++;
                        if (i % 2 == 1) {
                            mas[n - y][n - x] = count;
                        } else {
                            mas[n - x][n - y] = count;
                        }
                        y++;
                    }
                }
            }

        } else if (m.equals("right")) {
            for (int i = 0; i <= n-2; i++) {
                int y = i+1;
                for (int x = 0; x < n - i; x++) {
                    if (mas[x][i] == 0) {
                        count++;
                        mas[x][i] = count;
                    }
                }
                for (int x = i*2; x < n-1; x++) {
                    count++;
                    mas[n-x-2][y] = count;
                    y++;
                }
            }
        }
        return mas;
    }
}

