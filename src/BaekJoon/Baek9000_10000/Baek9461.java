package BaekJoon.Baek9000_10000;

import java.util.Scanner;

public class Baek9461 {
    public static void main(String[] args) {
        long []dp = new long[101];
        dp[1] = 1;
        dp[2] =1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        dp[6] = 3;
        for(int i  =7; i<101;i++){
            dp[i] = dp[i-1]+dp[i-5];
        }
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            System.out.println(dp[sc.nextInt()]);
        }
    }
}
