package BaekJoon.Baek1000_2000;

import java.io.*;
import java.util.StringTokenizer;

public class Baek1850 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");

        long AA = Long.parseLong(Tok.nextToken());
        long BB = Long.parseLong(Tok.nextToken());
        long k = gcd(AA,BB);
        while(k-->0){
            System.out.print('1');
        }
    }

    static long gcd(long a, long b){
        long mod = a%b;
        while(mod>0){
            a = b;
            b =mod;
            mod =  a%b;
        }
        return b;
    }
}
