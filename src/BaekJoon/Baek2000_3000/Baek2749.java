package BaekJoon.Baek2000_3000;

import java.lang.*;
import java.util.*;
public class Baek2749 {
    final static long [][] MATRIX = {{1L,1L},{1L,0L}};
    final static long REMAINDER =1000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        System.out.println(fibo(a));
    }
    static void multiply(long[][] matrix,long[][]matrix2){
        long a =(matrix[0][0]*matrix2[0][0]+ matrix[0][1]*matrix2[1][0])%REMAINDER;
        long b = (matrix[0][0]*matrix2[0][1] + matrix[0][1]*matrix2[1][1])%REMAINDER;
        long c = (matrix[1][0]*matrix2[0][0]+matrix[1][1]*matrix2[1][0])%REMAINDER;
        long d = (matrix[1][0]*matrix2[0][1]+matrix[1][1]*matrix2[1][1])%REMAINDER;
        matrix[0][0] = a;
        matrix[0][1] = b;
        matrix[1][0] = c;
        matrix[1][1] = d;

    }
    static long fibo(long N){
        if(N==0){
            return 0;
        }
        long matrix[][]= {{1,1},{1,0}};
        power(matrix,N-1);
        return matrix[0][0];
    }
    static void power(long [][] matrix, long N){
        if(N==0||N ==1){
            return;
        }
        power(matrix,N/2);
        multiply(matrix,matrix);
        if(N%2!=0){
            multiply(matrix,MATRIX);
        }
    }

}
