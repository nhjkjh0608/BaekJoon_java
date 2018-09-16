package BaekJoon.Baek11000_12000;
import java.io.*;
import java.util.StringTokenizer;

public class Baek11066 {
    static int[] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NN = Integer.parseInt(br.readLine());
        while(NN-->0){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];
            sum = new int[N+1];
            int [][] dp = new int[N+1][N+1];
            int index = 1;
            int S =0;
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            while(Tok.hasMoreTokens()){
                int tmp= Integer.parseInt(Tok.nextToken());
                S+=tmp;
                sum[index] = S;
                arr[index] = tmp;
                index ++;
            }

            for(int i =1, j =1; j<N+1;j++){
                for(int k=j; k<=N;k++,i++){
                    if(i==k){
                        dp[i][k] =0;
                        continue;
                    }
                    int max = 0;
                    int sum = getSum(i,k);


                    if(k-i >=2){
                        max = dp[i][i]+dp[i+1][k];
                        for(int q=i;q<=k-1; q++){
                            int tmp = dp[i][q]+dp[q+1][k];
                            max = Math.min(tmp,max);

                            //System.out.println(i+" "+q);
                            //System.out.println(q+1+" "+k);
                        }
                    }
                    dp[i][k] = sum + max;
                    //System.out.println(i+" "+k+"test"+dp[i][k]);
                }
                i =1;
            }
            System.out.println(dp[1][N]);

        }
    }
    static int getSum(int start, int end){
        return sum[end]- sum[start-1];
    }
}
