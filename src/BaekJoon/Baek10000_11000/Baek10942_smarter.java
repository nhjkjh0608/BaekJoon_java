package BaekJoon.Baek10000_11000;

/**
 * Created by 김재현 on 2017-07-20.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek10942_smarter {
    static int[][] dp;
    static int[] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N + 1];
        for (int i = 1; i <=N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new int[N + 1][N + 1];
        for (int i = 1; i <=N; i++) {
            Arrays.fill(dp[i], -1);
        }
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            if(dp[n1][n2]==-1) dp[n1][n2] = dfs(n1,n2);
            sb.append(dp[n1][n2]+"\n");
        }
        System.out.println(sb.toString());

    }

    private static int dfs(int i, int j) {
        if(dp[i][j] >= 0){
            return dp[i][j];
        }
        if(i < 1 || j > N || i > N || j < 1){
            return 0;
        }
        if(i==j || j < i){
            return 1;
        }
        if(arr[i]==arr[j]){
            return dp[i][j] = dfs(i+1,j-1);
        }else{
            return dp[i][j] = 0;
        }
    }
}
