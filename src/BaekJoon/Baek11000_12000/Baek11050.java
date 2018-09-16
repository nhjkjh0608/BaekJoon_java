package BaekJoon.Baek11000_12000;


import java.util.*;
public class Baek11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer Tok =new StringTokenizer(sc.nextLine()," ");
        int N = Integer.parseInt(Tok.nextToken());
        int K = Integer.parseInt(Tok.nextToken());
        int J = Math.min(N-K,K);
        int S   = 1;
        int Out = 1;
        for(int i =0; i<J; i++){
            Out *= N;
            Out/= (double)S;
            N --;
            S ++;
        }
        System.out.println(Out);

    }
}
