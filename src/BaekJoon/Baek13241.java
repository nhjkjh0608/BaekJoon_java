package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek13241 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
        long a=  Long.parseLong(Tok.nextToken());
        long b = Long.parseLong(Tok.nextToken());
        long c = a*b;
        System.out.println(c/gcd(a,b));

    }
    static long gcd(long a, long b){
        long mod = a%b;
        while(mod>0){
            a= b;
            b = mod;
            mod = a%b;
        }
        return b;
    }
}
