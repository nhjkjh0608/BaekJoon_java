package BaekJoon.Baek2000_3000;

import java.util.*;
import java.io.*;

public class Baek2293 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(Tok.nextToken());
        int K = Integer.parseInt(Tok.nextToken());
        int []coin = new int[N];
        int []cache = new int[K+1];
        cache[0] =1;
        for(int i=0; i<N;i++){
            coin[i]= Integer.parseInt(br.readLine());
        }
        for(int i= 0; i<N;i++){
            for(int j= coin[i]; j<cache.length;j++){
                cache[j] += cache[j-coin[i]];
            }
        }
        System.out.println(cache[K]);
    }
}
