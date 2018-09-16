package BaekJoon.Baek2000_3000;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int M = sc.nextInt();
        int matrix2[][] = new int[N][M];
        for(int i =0; i<N; i++){
            for(int j =0; j<M; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int output[][] = new int[n][M];
        for(int i = 0; i<n; i++){
            for(int j =0; j<M; j++){
                int k= 0;
                for(int i2 = 0; i2<m; i2++){
                    k+= matrix[i][i2]*matrix2[i2][j];
                }
                output[i][j] = k;

            }
        }
        for(int i =0; i<n; i++){

            for(int j =0; j<M; j++){
                System.out.print(output[i][j]);
                if( j ==M-1){
                    System.out.println();
                }else{
                    System.out.print(" ");
                }

            }

        }
    }
}
