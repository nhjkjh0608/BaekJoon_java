package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baek12850 {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long D = sc.nextInt();

        System.out.println(solve(D));
    }
    public static void multiply(long[][] matrix, long [][] matrix2){
        int L = matrix.length;
        long[][] tmpMatrix = new long[L][L];
        for(int i =0; i<L;i++){
            for(int j =0 ;j<L; j++){
                long tmp =0;
                for(int k= 0;k<L;k++){
                    tmp += (matrix[i][k]*matrix2[k][j]%mod);
                }
                tmpMatrix[i][j] = tmp%mod;

            }
        }
        for(int i =0 ; i<L;i++){
            for(int j= 0; j<L; j++){
                matrix[i][j] = tmpMatrix[i][j];

            }
        }
    }
    static long [][] MATRIX = {
            {0,1,1,0,0,0,0,0},
            {1,0,1,1,0,0,0,0},
            {1,1,0,1,1,0,0,0},
            {0,1,1,0,1,1,0,0},
            {0,0,1,1,0,1,0,1},
            {0,0,0,1,1,0,1,0},
            {0,0,0,0,0,1,0,1},
            {0,0,0,0,1,0,1,0}

    };
    static long solve(long N){
        long[][] matrix = {
                {0,1,1,0,0,0,0,0},
                {1,0,1,1,0,0,0,0},
                {1,1,0,1,1,0,0,0},
                {0,1,1,0,1,1,0,0},
                {0,0,1,1,0,1,0,1},
                {0,0,0,1,1,0,1,0},
                {0,0,0,0,0,1,0,1},
                {0,0,0,0,1,0,1,0}
        };
        power(matrix,N);

        return matrix[0][0];
    }
    static void power(long[][]matrix, long N){
        if(N==0|| N==1){
            return;
        }
        power(matrix, N/2);
        multiply(matrix,matrix);
        if(N%2!=0){
            multiply(matrix,MATRIX);
        }


    }

}
