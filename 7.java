public class Main {
public static void main(String args[]) {
    int n = 10, m = 5;
    int len_n = n, len_m = m;
    int nachal = 0;
    int mass[][];
    mass = new int[n][m];
    int count = 0;
    while(count != len_m*len_n){
        for (int i = n - 1; i == n - 1; i--) {
            for (int j = 0; j <= m - 1; j++) {
                count++;
                mass[i][j] = count;
            }
        }
        n -= 1;
        if(count ==len_m*len_n){
            break;
        }
        for (int j = m - 1; j == m - 1; j--) {
            for (int i = n - 1; i > nachal; i--) {
                count++;
                mass[i][j] = count;
            }
        }
        for (int i = nachal; i == nachal; i++) {
            for (int j = m - 1; j >= 0; j--) {
                count++;
                mass[i][j] = count;

            }
        }
        nachal += 1;
        m -= 1;
    }
    for(int i =0; i< len_n; i++){
        for(int j = 0; j< len_m;j++){
            System.out.print(mass[i][j]+ " ");
        }
        System.out.println("");
    }
}
}
