package BaekJoon.Baek2000_3000;

import java.math.BigInteger;
import java.util.*;
public class Baek2407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer Tok =new StringTokenizer(sc.nextLine()," ");
        int N = Integer.parseInt(Tok.nextToken());
        int K = Integer.parseInt(Tok.nextToken());
        int J = Math.min(N-K,K);
        BigInteger big = BigInteger.valueOf(1);
        BigInteger big2 = BigInteger.valueOf(1);
        int S   = 1;
        long Out = 1;
        for(int i =0; i<J; i++){
            big =big.multiply(BigInteger.valueOf(N));
            big2 =big2.multiply(BigInteger.valueOf(S));
            N --;
            S ++;
        }
        BigInteger b = big.divide(big2);
        System.out.println(b);
    }
}
