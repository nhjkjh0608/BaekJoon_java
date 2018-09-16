package BaekJoon.Baek6000_7000;

import java.util.*;
import java.io.*;
public class Baek6591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = " ";
        while(true){
            tmp = br.readLine();

            StringTokenizer Tok = new StringTokenizer(tmp," ");
            int N = Integer.parseInt(Tok.nextToken());
            int K = Integer.parseInt(Tok.nextToken());
            if(N==0&&K==0){
                break;
            }
            long Out = 1;
            int S = Math.min(N-K,K);
            int s = 1;
            for(int i =0; i<S; i++){
                Out *= N;
                Out /=s;
                N--;
                s++;
            }
            System.out.println(Out);

        }
    }
}
