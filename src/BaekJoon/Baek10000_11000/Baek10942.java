package BaekJoon.Baek10000_11000;
/**
 * Created by 김재현 on 2017-07-19.
 */
import java.io.*;
import java.util.StringTokenizer;

public class Baek10942 {
    public static void main(String[] args)throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        String[] stringArr = br.readLine().split(" ");

        boolean[][] dp = new boolean[caseNum+1][caseNum+1];
        for(int i = 1; i<=caseNum;i++){
           Loop1: for(int j =1; j<=caseNum; j++){
                if(i==j){
                    dp[i][j] = true;
                    continue;
                }
                if(i>j){
                    dp[i][j] = dp[j][i];
                    continue;
                }
                if(dp[i+1][j-1]&&stringArr[i-1]==stringArr[j-1]){
                    dp[i][j] = true;
                    continue;
                }
                int k = i;
                int m = j;
                while(k<m){

                    if(!stringArr[k-1].equals(stringArr[m-1])){

                        continue Loop1;
                    }
                    k++;
                    m--;
                }
                dp[i][j] = true;
            }
        }
        int questionNum = Integer.parseInt(br.readLine());
        for(int i =0; i<questionNum; i++){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            int a= Integer.parseInt(Tok.nextToken());
            int b = Integer.parseInt(Tok.nextToken());

            if(dp[a][b]){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}
