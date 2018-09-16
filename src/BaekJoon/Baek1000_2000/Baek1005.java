package BaekJoon.Baek1000_2000;

import java.util.*;
import java.io.*;
public class Baek1005 {
    static int[] buildingtime;
    static int[] dp;
    static boolean[][] bol;
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NN = Integer.parseInt(br.readLine());
        while(NN-->0){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            int buildingNum = Integer.parseInt(Tok.nextToken());
            int caseNum = Integer.parseInt(Tok.nextToken());
            dp = new int [buildingNum+1];
            for(int i=0; i<dp.length;i++){
                dp[i]=-1;
            }


            buildingtime = new int[buildingNum+1];
            StringTokenizer t = new StringTokenizer(br.readLine()," ");
            int index =1;
            while(t.hasMoreTokens()){
                buildingtime[index] = Integer.parseInt(t.nextToken());
                index++;
            }

            bol = new boolean[buildingNum+1][buildingNum+1];
            while(caseNum-->0){
                StringTokenizer Tok1 = new StringTokenizer(br.readLine()," ");
                int F = Integer.parseInt(Tok1.nextToken());
                int L = Integer.parseInt(Tok1.nextToken());
                bol[L][F] = true;
            }
            int Final = Integer.parseInt(br.readLine());
            System.out.println(getDP(Final));
        }
    }
    static int getDP(int N){
        if(dp[N]!=-1){
            return dp[N];
        }
        int out = buildingtime[N];
        int Max =0;
        for(int i =1; i<buildingtime.length;i++){
            if(bol[N][i]){
                Max = Math.max(Max,getDP(i));
            }
        }
        dp[N] = out+Max;
        return out+Max;
    }
}
