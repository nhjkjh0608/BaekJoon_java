package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-11.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//python 으로 풀어서 다른 사람의 소스를 보았다
public class Baek2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int t = Integer.parseInt( token.nextToken() );
        StringBuffer[] results = new StringBuffer[t];
        for(int k = 0; k<t; k++) {
            token = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(token.nextToken());
            String str = token.nextToken();
            results[k] = new StringBuffer();
            for(int i=0; i<str.length(); i++) {
                for(int j=0; j<repeat; j++) {
                    results[k].append( str.charAt( i ) );
                }
            }
        }
        for(int k = 0; k<t; k++) {
            System.out.println( results[k].toString() );
        }
    }
}
