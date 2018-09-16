package BaekJoon.Baek4000_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek4883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 3;
        int Case =1;
        while(true) {
            N = Integer.parseInt(br.readLine());
            if(N==0){
                break;
            }
            int[][] arr = new int[N][5];
            for (int i = 0; i < N; i++) {
                StringTokenizer tok = new StringTokenizer(br.readLine());
                arr[i][1] = Integer.parseInt(tok.nextToken());
                arr[i][2] = Integer.parseInt(tok.nextToken());
                arr[i][3] = Integer.parseInt(tok.nextToken());
            }
            int[][] dp = new int[N][5];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 5; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            dp[0][2] = arr[0][2];
            dp[0][3] = arr[0][2] + arr[0][3];
            for (int i = 1; i < N; i++) {
                for (int j = 1; j <= 3; j++) {
                    dp[i][j] = min(dp[i - 1][j], dp[i - 1][j - 1], dp[i - 1][j + 1],dp[i][j-1]) + arr[i][j];
                }
            }
            System.out.println(Case+". "+dp[N - 1][2]);
            Case++;
        }
    }
    static int min(int a, int b, int c,int d){
        int tmp = Math.min(a,b);
        int tmp2  = Math.min(c,d);
        return Math.min(tmp, tmp2);
    }
}
