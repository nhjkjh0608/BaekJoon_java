package BaekJoon.Baek1000_2000;

import java.io.*;
import java.util.StringTokenizer;

public class Baek1934 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(Tok.nextToken());
            int b = Integer.parseInt(Tok.nextToken());
            System.out.println(a*b/gcd(a,b));
        }
    }
    static int gcd(int a, int b){
        int mod = a%b;
        while(mod>0){
            a= b;
            b = mod;
            mod = a%b;
        }
        return b;
    }
}
