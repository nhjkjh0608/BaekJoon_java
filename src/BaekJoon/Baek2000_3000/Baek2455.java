package BaekJoon.Baek2000_3000;

import java.io.*;
import java.util.StringTokenizer;


public class Baek2455 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Sum = 0;
        for(int i =0; i<4; i++){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(Tok.nextToken());
            int b = Integer.parseInt(Tok.nextToken());
            if(a<b){
                Sum-= a;
                Sum +=b;
            }

        }
        System.out.println(Sum);
    }
}
