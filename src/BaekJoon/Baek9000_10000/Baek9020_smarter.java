package BaekJoon.Baek9000_10000;

/**
 * Created by 김재현 on 2017-07-18.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Baek9020_smarter {
    static int T;
    static int N;
    static boolean[] arrN;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        arrN = new boolean[10001];
        Arrays.fill(arrN, true);
        arrN[0] = arrN[1] = false;
        for(int i = 2 ; i <= 10000 ; i++) {
            if(arrN[i]) {
                for(int j = i+i ; j <= 10000 ; j += i) {
                    arrN[j] = false;
                }
            }
        }
        while(T-- > 0) {
            N = Integer.parseInt(br.readLine());
            int index = 0;
            for(int i = 0 ; i <= N/2 ; i++) {
                index = i;
                if(arrN[N/2-index]&&arrN[N/2+index]) {
                    break;
                }
            }
            System.out.println((N/2-index)+" "+(N/2+index));
        }
    }
}
