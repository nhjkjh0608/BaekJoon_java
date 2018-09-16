package BaekJoon.Baek1000_2000;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int arr[][] = new int[N][N];
        for(int i =0 ; i<N; i++){
            String S = sc.nextLine();
            for(int j =0 ; j<S.length(); j++){
                arr[i][j] = S.charAt(j) -'0';
            }
        }
        solve(arr,0,0, N);
    }
    static void quadTree(int [][]arr,int x, int y, int size){
        System.out.print('(');
    }
    static boolean check(int [][] arr,int x, int y,int size){
        int start = arr[x][y];
        for(int i = 0; i<size; i++){
            for(int j =0; j<size; j++){
                if(arr[i+x][j+y]!= start){return false;}
            }
        }
        return true;
    }
    static void solve(int arr[][],int x,int y,  int size){
        if( check(arr,x,y,size)||size ==1){
            System.out.print(arr[x][y]);
            return;
        }else{
            size/=2;
            System.out.print('(');
            solve(arr, x,y, size);
            solve(arr, x, y+size, size);
            solve(arr, x+size, y, size);
            solve(arr, x+size, y+size, size);
            System.out.print(')');
        }
    }
}
