package BaekJoon.Baek3000_4000;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3036 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
        int standard = Integer.parseInt(Tok.nextToken());
        while(Tok.hasMoreTokens()){
            StringBuffer bf = new StringBuffer("");
            int tmp = Integer.parseInt(Tok.nextToken());
            int GCD = gcd(standard,tmp);
            bf.append(standard/GCD);
            bf.append('/');
            bf.append(tmp/GCD);
            System.out.println(bf.toString());
        }

    }

    static int gcd(int a , int b){
        int mod  = a%b;
        while(mod>0){
            a = b;
            b = mod;
            mod = a%b;
        }
        return b;
    }
}
