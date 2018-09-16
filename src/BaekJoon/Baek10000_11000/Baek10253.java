package BaekJoon.Baek10000_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10253 {
    static int a =-1;
    static int b =-1;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(Tok.nextToken());
            b = Integer.parseInt(Tok.nextToken());
            int start = 0;
            int top = 1;
            while (a != 0) {
                start = b / a;
                while (!bigggerOrSame(a, b, top, start)) {
                    start++;
                }
                minus(a, b, top, start);
            }
            System.out.println(b);
        }
    }

    static boolean bigggerOrSame(int x, int x1, int y, int y1){
        if(x*y1>=y*x1){
            return true;
        }else{
            return false;
        }
    }
    static void minus(int x, int x1, int y, int y1){
        int gcd = gcd(x1,y1);
        int X = x1/gcd;
        int Y = y1/gcd;
        a = x*Y - y*X;
        b = gcd*X*Y;
        int tmp = gcd(a,b);

        if(tmp!=1){
            if(a!=0) {
                a /= tmp;
                b /= tmp;
            }
        }
    }
    public static int gcd(int x, int y){
        int mod  = x%y;
        while(mod>0){
            x = y;
            y = mod;
            mod = x%y;
        }
        return y;

    }


}
