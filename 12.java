import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n]; // A
        int [] arr_1 = new int[n]; // X
        int [] arr_2 = new int[n]; // F
        int [] arr_sr = new int[n];
        System.out.println("Zapolnite koofizcienti ");
        for (int [] ints : arr){
            for (int anInt : ints){
                anInt = in.nextInt();
            }
        }
        System.out.println("Zapolnite F");
        for (int a : arr_1){
            a = in.nextInt();
        }
        System.out.println("Zapolnite resheniya X");
        for (int a : arr_2){
            a = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr_sr[i] += arr[i][j] * arr_1[j];
            }
        }
        if (Arrays.equals(arr_2,arr_sr)){
            System.out.println("All good");
        }
        else System.out.println("Wrong");
    }
}
