package BaekJoon.Baek1000_2000;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1520 {
    static int Out =0;

    static int M;
    static int N;
    static int[][] height;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(tok.nextToken());
        N = Integer.parseInt(tok.nextToken());
        height = new int [M+2][N+2];
        for(int i= 1; i<M+1;i++){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            for(int j =1; j<N+1;j++){
                height[i][j] = Integer.parseInt(Tok.nextToken());
            }
        }
        solve(1,1);
        System.out.println(Out);
    }
    static void solve(int i, int j){
        if(i==M&& j==N){
            Out+=1;
            return;
        }
        if(height[i][j+1]!=0 &&height[i][j+1]<height[i][j]){
            solve(i,j+1);
        }
        if(height[i+1][j]!=0 && height[i+1][j]<height[i][j]){
            solve(i+1,j);
        }
        if(height[i][j-1]!=0 && height[i][j-1]<height[i][j]){
            solve(i,j-1);
        }
        if(height[i-1][j]!=0&& height[i-1][j]<height[i][j]){
            solve(i-1,j);
        }
    }
}
