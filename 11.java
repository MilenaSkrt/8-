import java.util.*;
import static java.lang.Math.*;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt(); double ab, bc, cd, ad, ac, bd;
        int [][] arr = new int[2][4 * n]; int [][] arr_1 = new int[4][n];
        getArr(arr);
        PrintOut(arr);
        for (int i = 0, j = 0; j < n * 4; j+=4, i++){
            ab = sqrt(pow(arr[0][j] - arr[0][j + 1], 2) + pow(arr[1][j] - arr[1][j + 1], 2));
            bc = sqrt(pow(arr[0][j + 1] - arr[0][j + 2], 2) + pow(arr[1][j + 1] - arr[1][j + 2], 2));
            cd = sqrt(pow(arr[0][j + 2] - arr[0][j + 3], 2) + pow(arr[1][j + 2] - arr[1][j + 3], 2));
            ad = sqrt(pow(arr[0][j + 3] - arr[0][j], 2) + pow(arr[1][j + 3] - arr[1][j], 2));
            ac = sqrt(pow(arr[0][j] - arr[0][j + 2], 2) + pow(arr[1][j] - arr[1][j + 2], 2));
            bd = sqrt(pow(arr[0][j + 1] - arr[0][j + 3], 2) + pow(arr[1][j + 1] - arr[1][j + 3], 2));
            if ((arr[0][j + 2] - arr[0][j]) / ((arr[0][j + 1] - arr[0][j])) == (arr[1][j + 2] - arr[1][j]) / ((arr[1][j + 1] - arr[1][j]))){
                arr_1[0][i] = 0;
                arr_1[1][i] = 0;
                arr_1[2][i] = 0;
                arr_1[3][i] = 0;
            }
            else {
                arr_1[0][i] = 1;
                if (ab == bc & bc == cd & cd == ad & ac == bd){
                    arr_1[1][i] = 2;
                }
                else if (ab == cd & bc == ad & ac == bd){
                    arr_1[1][i] = 1;
                }
                else if (ab == bc & bc == cd & cd == ad){
                    arr_1[1][i] = 3;
                }
                else if ((arr[0][j + 1] - arr[0][j]) / (arr[0][j + 3] - arr[0][j + 2]) == (arr[1][j + 1] - arr[1][j]) / (arr[1][j + 3] - arr[1][j + 2])){
                    arr_1[1][i] = 4;
                }
                else arr_1[1][i] = 5;
                arr_1[2][i] = abs((arr[0][j] - arr[0][j + 1]) * (arr[1][j] + arr[1][j + 1]) +
                        (arr[0][j + 1] - arr[0][j + 2]) * (arr[1][j + 1] + arr[1][j + 2]) +
                        (arr[0][j + 2] - arr[0][j + 3]) * (arr[1][j + 2] + arr[1][j + 3]) +
                (arr[0][j + 3] - arr[0][j]) * (arr[1][j + 3] + arr[1][j]))/2;
                if (ab == cd & bc == ad) arr_1[3][i] = 1;
                else arr_1[3][i] = -1;
            }
        }
        PrintOut(arr_1);
    }
    public static void getArr(int [][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    public static void PrintOut(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " | \t");
            }
            System.out.println();
        }
    }
}
