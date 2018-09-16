package BaekJoon.Baek1000_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class Baek1325_smarter {


    static int N,M;
    static ArrayList[] adj;
    static int[] cnt;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    static int count;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        cnt = new int[N+1];
        visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            visited[i] = true;
            dfs(i);
            max = Math.max(max, count);
            cnt[i] = count;
            count = 0;
        }
        for(int i=1; i<N+1; i++){
            if(cnt[i]== max) System.out.print(i+ " ");
        }
    }
    public static int  dfs(int here){
        for (int i = 0; i < adj[here].size(); i++) {
            int there = (int)adj[here].get(i);

            if(!visited[there]){
                visited[there] = true;
                dfs(there);
                count++;
            }
        }
        return count;
    }
}