package BaekJoon.Baek9000_10000;

import java.io.*;
import java.util.LinkedList;

public class Baek9252 {

    public static void main(String[] args)throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        String second = br.readLine();
        StringBuffer buf = new StringBuffer();
        int FL = first.length();
        int SL = second.length();
        int [][]dp = new int [FL+1][SL+1];
        int [][]type = new int [FL+1][SL+1];
        for(int i =1; i<=FL;i++){
            for(int j =1 ; j<=SL;j++){
                if(first.charAt(i-1)==second.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    type[i][j] = 1;
                }else if(dp[i-1][j]>dp[i][j-1]){
                    dp[i][j] = dp[i-1][j];
                    type[i][j] = 2;
                }else{
                    dp[i][j] = dp[i][j-1];
                    type[i][j] = 3;
                }
            }
        }
        System.out.println(dp[FL][SL]);
        while(FL>0 &&SL>0){
            if(type[FL][SL] == 1){
                list.push(first.charAt(FL-1));
                FL--;
                SL-- ;
            }else if(type[FL][SL]==2){
                FL--;
            }else{
                SL--;
            }
        }
        while(!list.isEmpty()){
            buf.append(list.pop());
        }
        System.out.println(buf.toString());

    }
}