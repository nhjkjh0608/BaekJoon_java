package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-13.
 */
import java.util.Scanner;
public class Baek2775 {
    public static void main(String[] args) {
        int [][] arr = new int [15][14];
        for(int i = 0; i<14 ;i++){
            arr[0][i] =i+1;
        }
        for(int i = 1; i<15;i++){
            for(int j = 0; j<14 ; j++){
                int sum = 0;
                for(int k = 0; k<=j;k++){
                    sum += arr[i-1][k];
                }
                arr[i][j] =sum;
            }
        }
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        int []Arr = new int[Case];
        for(int i = 0 ; i<Case; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            Arr[i] = arr[h][w-1];
        }
        for(int i: Arr){
            System.out.println(i);
        }
    }
}
