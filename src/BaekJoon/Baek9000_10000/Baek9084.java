package BaekJoon.Baek9000_10000;

import java.util.Arrays;
import java.util.Scanner;

public class Baek9084 {
    public static void main(String[] args) {
        int []dp; int []coins;
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        for(int qq = 0; qq<Case; qq++){

            int coinN = sc.nextInt();
            coins = new int[ coinN];
            for(int i= 0 ; i<coinN ;i++){
                coins[i] = sc.nextInt();
            }
            int lastCoin = coins[coinN-1];
            int len = sc.nextInt();
            dp = new int[len+1];

            dp[0] = 1;
            for(int i : coins){
                for(int j = i; j<=len; j++){
                    dp[j] += dp[j- i];
                }
            }
            System.out.println(dp[len]);
        }
    }

}
