import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("ВВедите знначение n , определяющая порядок матрицы: ");
        int n = scn.nextInt();

        int count = 0, nachal_i = 0 , nachal_j = 0,
                konetc_i = n-1, konetc_j= n-1,flag_natchal = 0, flag_konetc = 4,
                razmer_mal_matrec = 0;

        int mass[][];
        mass = new int[n][n];


        while(flag_natchal < flag_konetc) {
            if(n%2 ==0) {
                switch (flag_natchal) {
                    case (0):
                        nachal_j = 0;
                        nachal_i = n / 2;
                        konetc_j = n / 2;
                        konetc_i = n;
                        razmer_mal_matrec = n*n/4;
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (1):
                        nachal_j = 0;
                        nachal_i = 0;
                        konetc_j = n / 2;
                        konetc_i = n / 2;
                        razmer_mal_matrec = n*n/4;
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (2):
                        nachal_i = 0;
                        nachal_j = n / 2;
                        konetc_i = n / 2;
                        konetc_j = n;
                        razmer_mal_matrec = n*n/4;
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (3):
                        nachal_i = n / 2;
                        nachal_j = n / 2;
                        konetc_i = n;
                        konetc_j = n;
                        razmer_mal_matrec = n*n/4;
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);

                }
            } else{
                switch (flag_natchal) {
                    case (0):
                        nachal_j = 0;
                        nachal_i = n / 2 ;
                        konetc_j = n / 2 ;
                        konetc_i = n;
                        razmer_mal_matrec = n/2 * (n/2+1);
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (1):
                        nachal_j = 0;
                        nachal_i = 0;
                        konetc_j = n / 2 ;
                        konetc_i = n / 2 ;
                        razmer_mal_matrec = n/2 * (n/2);
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (2):
                        nachal_i = 0;
                        nachal_j = n / 2;
                        konetc_i = n / 2 ;
                        konetc_j = n;
                        razmer_mal_matrec = n/2 * (n/2+1);
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                    case (3):
                        nachal_i = n / 2;
                        nachal_j = n / 2;
                        konetc_i = n;
                        konetc_j = n;
                        razmer_mal_matrec = (n/2+1) * (n/2+1);
                        FillTheBlock(mass, n, nachal_i, nachal_j, count, konetc_i, konetc_j,razmer_mal_matrec);
                }
            }
            flag_natchal++;

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println("");
        }

    }
    public static void FillTheBlock(int [][] mass, int n, int nachal_i, int nachal_j,
                                    int count, int konetc_i, int konetc_j, int razmer_mal_matrec){
        while (count < razmer_mal_matrec ) {

            for (int i = nachal_i; i != nachal_i + 1; i++) {
                for (int j = konetc_j - 1; j >= nachal_j; j--) {
                    count++;
                    mass[i][j] = count;
                }
            }
            nachal_i++;
            for (int j = nachal_j; j != nachal_j + 1; j++) {
                for (int i = nachal_i; i < konetc_i; i++) {
                    count++;
                    mass[i][j] = count;
                }
            }
            nachal_j++;
        }

    }

}
