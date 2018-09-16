package BaekJoon.Baek11000_12000;
import java.util.Scanner;
public class Baek11401 {
    static long k ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 1000000007;
        long N = sc.nextLong();
        long K = sc.nextLong();
        long M = Math.min(K,N-K);
        long a =1;
        long[] b =new long[1];
        b[0] =1;
        long c =1;
        for(int i =0 ;i<M; i++){
            a= (a*N)%check;
            N--;
            b[0] = (b[0]*c)%check;
            c++;
        }
        k= b[0];
        power(b,1000000005);
        System.out.println((a*b[0])%check);
    }
    static void power(long[]M,long N){
        if (N==0||N==1){
            return;
        }
        power(M,N/2);
        M[0] = M[0]*M[0]%1000000007;
        if(N%2==1){
            M[0] = M[0]*k %1000000007;
        }
    }

}
