package BaekJoon.Baek1000_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1520_smarter {

    static int[][] a = {{1,0},{0,1},{-1,0},{0,-1}};
    static int M;
    static int N;
    static int[][] height;
    static int[][] cache;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(tok.nextToken());
        N = Integer.parseInt(tok.nextToken());
        height = new int [M+1][N+1];
        cache = new int [M+1][N+1];
        for(int i= 1; i<M+1;i++){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            for(int j =1; j<N+1;j++){
                height[i][j] = Integer.parseInt(Tok.nextToken());
            }
        }
        for(int i =0; i<M+1; i++){
            Arrays.fill(cache[i],-1);
        }
        dp(1,1);
        System.out.println(cache[1][1]);


    }
    static int dp(int x, int y){
        if(x==M&&y==N){
            return 1;
        }
        if(cache[x][y]>-1){
            return cache[x][y];
        }
        int tmp =0;
        for(int i=0; i<4;i++){
            int X = x+a[i][0];
            int Y = y+ a[i][1];
            if(X<1||X>M||Y<1||Y>N){
                continue;
            }
            if(height[X][Y]<height[x][y]){
                tmp += dp(X,Y);
            }
        }
        return cache[x][y] = tmp;


    }

}
